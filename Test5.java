
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Amazon customer=new Amazon();
                float payableamount=customer.transcation(1000);
                System.out.print(payableamount);
	}

}
class Amazon{
	float transcation(float amt)
	{
		GPAY gpayobj=new GPAY();
		float totalamount=amt+(amt*gpayobj.txncharge);
		return totalamount;
	}
}
class GPAY{
	 float txncharge=(float) 0.5f;
}