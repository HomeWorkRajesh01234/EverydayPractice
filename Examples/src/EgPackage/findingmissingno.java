package EgPackage;

public class findingmissingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,6};
int expected_no_element=a.length+1;
int total_sum=expected_no_element*(expected_no_element+1)/2;
//System.out.print(total_sum);

int sum=0;
for(int i=0; i<a.length; i++)
{
	sum=sum+a[i];
}
System.out.println("missing no is:"+(total_sum-sum));
}
	}


