public class Memanggil {
        public static void main (String[] args) {
        Daerah dh = new Daerah();
        
		dh.Callnegara();
        dh.Callibukota();
        dh.setPulau("Jawa");
        System.out.println("Pulau = " +dh.getPulau());
        dh.setWilayah("Barat");
        System.out.println("Waktu Indonesia Bagian = " +dh.getWilayah());
    }

    
}
