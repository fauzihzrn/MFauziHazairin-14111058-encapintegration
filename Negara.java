public abstract class Negara {
    
    protected String negara;
    protected String ibukota;
	
    protected String getNegara() {
        return this.negara;
        
    }
    
    protected String getIbukota() {
        return this.ibukota;
        
    }
    public void setNegara(String ngr) {
      this.negara = ngr;  
        
    }
    
    public void setIbukota(String ikota) {
        this.ibukota = ikota;
    }
    
    protected abstract void Callnegara();
    protected abstract void Callibukota();
    
	
}