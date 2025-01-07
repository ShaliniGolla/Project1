class ex{
    int fun(String str)
    {
        int count=0;
     for(int i=0;i<str.length;i++)
     {
        if(i=="(" )
            count++;
        else if(i==")")
            count--;
        if(count<0){
            break;
        }
     }   
     if(count==0)
         return 0;
    else
        return 1;
    }

    
}

public class java1 {
    
    public static void main(String args[])
    {
        String s="(ss(ss(s)))";
        ex x= new ex();
        System.out.println(x.fun(s));
    }
}
