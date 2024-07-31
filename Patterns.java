class Patterns
{
    public static void main(String[] args) 
    {
        int rows=5,rows1=4;
        for(int r=1;r<=rows;r++)
        {
            for(int c=rows;c>=r;c--)
            {
                System.out.print("# ");
            }
            System.out.println("  ");
        }
        for(int r1=1;r1<=rows1;r1++)
        {
            for(int c1=1;c1<=r1+1;c1++)
            {
                System.out.print("# ");
            }
            System.out.println("  ");
        }
       // System.out.println("Try programiz.pro");
    }
}