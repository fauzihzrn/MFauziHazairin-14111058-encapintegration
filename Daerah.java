public class Daerah extends Negara  {
 
    private String Pulau ;
    private String Wilayah;
   
    public void setPulau(String prov){
        this.Pulau = prov;
    }
    public void setWilayah(String kt){
        this.Wilayah = kt;        
    }
    public String getPulau(){
        return this.Pulau;
    }
    public String getWilayah(){
        return this.Wilayah;
    }    

    
    @Override
    protected void Callnegara() {
     super.setNegara("Indonesia"); 
     System.out.println("Negara = " +super.getNegara());
    }

    @Override
    protected void Callibukota() {
       super.setIbukota("Jakarta"); 
     System.out.println("Ibukota = " +super.getIbukota());
    }


    
}
