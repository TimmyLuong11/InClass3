/*
 * 02/12/2019  
 */

public class Equalizer 
{
	private int data;
	public Equalizer(int data)
	{
		this.data = data;
	}
	
	public boolean equals(Equalizer e)
	{
		return(this.data == e.data);
	}
	
	@Override
	public String toString() {
		return "Equalizer [data=" + data + "]";
	}
	
	public static void main(String[] args)
	{
		Equalizer e1 = new Equalizer(10);
		Equalizer e2 = new Equalizer(10);
		
		if(e1 == e2)
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
		if(e1.equals(e2))
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
	}
}
/* 
In the code above why does .equals work but not ==?
a) They are comparing references
b) They are comparing content
*/
