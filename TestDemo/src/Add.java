
public class Add {
	public int prime(int n)
	{
		 int i,m=0,flag=0;        
		  m=n/2;      
		  if(n==0||n==1){  
		   return 0;    
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){        
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { return n; } 
		   else
			   return 0;
		  }//end of else  
	}
}
