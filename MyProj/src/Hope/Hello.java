package Hope;

public class Hello {
    private String tmpStr = Messages.getString("Hello.0"); //$NON-NLS-1$
    static String orgStr = Messages.getString("Hello.1"); //$NON-NLS-1$
    public String getTmpStr() {
        return tmpStr;
        
    }
    /**
     * @param tmpStr
     */
    public void setTmpStr(String tmpStr) {
        this.tmpStr = tmpStr;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {       
        try {                                                           
            // TODO Auto-generated method stub                          
            System.out.println("Helloc YA, " + orgStr); //$NON-NLS-1$  
            System.out.println("Test");
        } catch (Exception e) {                                         
            // TODO Auto-generated catch block                          
            e.printStackTrace();                                        
        }                                                               
    }

}
