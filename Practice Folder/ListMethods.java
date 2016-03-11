import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> temp =  new ArrayList<Integer>(0);
        if (n <= 0)  // The smallest list we can make
        {
            temp.add(0);
        }
        else        // All other size lists are created here
        {            
            temp.addAll(makeList(n-1));
            temp.add(n);            
        }
        return temp;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList); 
        if (list.size() <=1 )
        {
            return list;
        }
        else
        {
            list.remove(0);
            list.add(0);
        }
        return list;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }
}