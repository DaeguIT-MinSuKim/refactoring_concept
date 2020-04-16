package refactoring_concept;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
    private List<Rental> rentals = new ArrayList<>();
    
    public Customer(String aName) {
        this.name = aName;
    }
    
    public void addRental(Rental aRental){
        this.rentals.add(aRental);
    }

    public String getName() {
        return this.name;
    }

    public String statement(){
        StringBuilder result = new StringBuilder(getName() + " 고객님의 대여 기록\n");
//      비디오 종류별 대여료 계산
        for(Rental each : rentals){
//          이번에 대여하는 비디오 정보와 대여료를 출력
            result.append("\t"+each.getMovie().getTitle());
            result.append("\t"+String.valueOf(each.getCharge())+"\n");
        }//end of for-loop
        
//      푸터행 추가
        result.append("누적 대여료 : " + String.valueOf(getTotalCharge()) + "\n");
        result.append("적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints()));
        
        return result.toString();
    }//end of method statement

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		for(Rental each : rentals){
			result += each.getFrequentRenterPoints();
		}
		return result;
	}

	private int getTotalCharge() {
		int result = 0;
		for(Rental each : rentals){
			result += each.getCharge();
		}
		return result;
	}

}
