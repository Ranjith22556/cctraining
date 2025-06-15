public class extractnum {
    public static void main(String[] args) {
        String s="234 bhuiiaaa hehehe 345 he 7";
        String words[]=s.split(" ");
        int sum=0;
        for ( String t:words){
            try{
                if(Integer.parseInt(t)>0)
                System.out.println(t);
                sum=sum+Integer.parseInt(t);
                }
                catch(Exception e){
                    //System.out.println("Catch Block");
                }
            }
            System.out.println("Sum:"+sum);
        }
    }
