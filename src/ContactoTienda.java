
public class ContactoTienda {
    
    private String horario;
    private int telefono;

    public ContactoTienda(String horario, int telefono) {
        this.horario = horario;
        this.telefono = telefono;
    }

    
    public String toString(){
        String info="";
        
        info="         Horario atencion: "+horario+". Telefono: "+telefono+".\n";
       
        return info;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getHorario() {
        return horario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
