import java.util.*;

interface buzzy
{
    public void checkbuzz();
}

interface frequency
{
    public void checkfreq();
}

public class buzzfreq implements buzzy,frequency
{
    public void checkbuzz()
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("To check if number is buzz or not \n enter the number");
        number=sc.nextInt();
        if(number%10==7 || number%7==0)
        {
            System.out.println("Number "+ number + " is a buzz number\n ");
        }
        else
        {
            System.out.println("Number "+ number + " is not a buzz number\n ");
        }
    }
    
    public void checkfreq(){
        int size,fr,cout=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("To find frequency of a given number \n Enter the size of the array");
        size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter "+size+" elements :");
        for(int i =0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
         System.out.println("Enter the number whose frequency you want to find ");
         fr=sc.nextInt();
         for(int i =0;i<size;i++)
        {
            if(fr==array[i])
            cout++;
        }
         System.out.println("Frequency of "+fr+" is : "+cout);
        
    }
    
    public static void main(String args[])
    {
        buzzfreq obj = new buzzfreq();
        obj.checkbuzz();
        obj.checkfreq();
    }
}
