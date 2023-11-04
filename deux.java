public class deux 
{
    public int ing(int cash, int rate, int year)
    {
        return cash*(1+(rate/12/100)^year*12);
    }
    public static void main(String[] args)
    {
        deux ln= new deux();
        int igisubizo= ln.ing(500000, 18, 03);
        System.out.println(igisubizo);
    }    
}
