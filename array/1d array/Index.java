//Demonstrate one dimensional array.
public class Index{
    public static void main(String[] args){
	int month_days[];
	month_days = new int[12];
	month_days[0] = 31;
	month_days[1] = 28;
	month_days[2] = 31;
	month_days[3] = 30;
	month_days[4] = 31;
	month_days[5] = 30;
	month_days[6] = 31;
	month_days[7] = 30;
	month_days[8] = 31;
	month_days[9] = 30;
	month_days[10] = 31;
	month_days[11] = 30;
	System.out.println("April has "+month_days[3]+" days");
    }
}
