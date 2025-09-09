package tugas1;

public class Customer {
    
    private String id;
    private String nama;
    private String alamat;
    private String noHp;

    
    public Customer(String id, String nama, String alamat, String noHp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
    }

   
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    public class Main {
        public static void main(String[] args) {
            
            Customer customer1 = new Customer("C001", "Budi", "Jl. Mawar No. 10", "081234567890");

            
            System.out.println("ID: " + customer1.getId());
            System.out.println("Nama: " + customer1.getNama());
            System.out.println("Alamat: " + customer1.getAlamat());
            System.out.println("Nomor HP: " + customer1.getNoHp());

            
            System.out.println("\nMengubah alamat...");
            customer1.setAlamat("Jl. Anggrek No. 20");

           
            System.out.println("Alamat baru: " + customer1.getAlamat());
        }
    }
}