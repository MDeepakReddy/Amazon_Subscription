package firstproject;

public class methods {
	
	public static int findRemainingDays(Amazonprime[] a,int newid,int days) 
	{
		int result = 0;
		for(Amazonprime ap:a)
		{
		    if(ap!=null) {
		    	if(ap.getId()==newid)
			    {
			        result = ap.getSubPackage()-days;
			        break;
			    }
		    }
		    else {
		    	System.out.println("error");
		    	break;
		    }
	    }
		return result;
	}
	
	
	public static void getDetails(Amazonprime[] a,String show)
	{
		int b = 0;
		int c = 0;
		for(Amazonprime ap:a) 
		{
			if(ap!=null) {
				if(ap.getShowStreaming().equals(show))
				{
					b = ap.getId();
					c = ap.getViews();
					System.out.println(b);
					System.out.println(c);
					break;
				}
			}
			else {
				System.out.println("Error");
				break;
			}
			
		}
	}

}
