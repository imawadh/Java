public class SquareTriangle {
    
    
        public static void main(String[] args) {
            for(int i =1; i<=5;i++)
            {
                
                    for(int j =1; j<=i; j++)
                    {
                        if(j<=2){
                        if(j%2==1)
                        {
                            System.out.print((i+(j-1)*5)+" ");
                        }
                        else{
                            System.out.print(((5*j)-(i-1))+" ");
                        }
                        }
                        else{
                            if(j%2==1)
                        {
                            System.out.print((i+(j-1)*5)-(((i-1)*i)/2)+" ");
                        }
                        else{
                            System.out.print(((5*j)-(i-1)-(((i-1)*i)/2))+" ");
                        }

                        }
                    }
                
                
                System.out.println();
            }
    
        }
        
    }


