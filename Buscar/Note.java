
/**
 * Note Class
 *
 * @author Chavez Sanchez Kevin Edilberto
 * @version 2019 11 29
 */
public class Note
{
    // Declaracion de variables de clase
    private int id;
    private String titulo;
    private String descripcion;
    private String fecha;
    /**
     * Constructor vacio
     */
    Note()
    {
       
    }
    /**
     * Este metodo te facilita el cambiar la variable id
     * @param id es un entero 
     * @return vacio
     */
    public void setId(int id){this.id=id;
    }
    /**
     * Este metodo te facilita el cambiar la variable titulo
     * @param titulo es una cadena
     * @return vacio
     */
    public void setTitulo(String titulo){this.titulo=titulo;
    }
    /**
     * Este metodo te facilita el cambiar la variable descripcion
     * @param id es una cadena 
     * @return vacio
     */
    public void setDescripcion(String descripcion){this.descripcion=descripcion;
    }
    /**
     * Este metodo te facilita el cambiar la variable fecha
     * @param id es una cadena
     * @return vacio
     */
    public void setFecha(String fecha){this.fecha=fecha;
    }
    /**
     * Este metodo te facilita la variable id
     *  
     * @return el valor del id
     */
    public int getId(){
        return id;
    }
    /**
     * Este metodo te facilita la variable titulo
     *  
     * @return el valor del titulo
     */
    public String getTitulo(){
        return titulo;
        }
     /**
     * Este metodo te facilita la variable descripcion
     *  
     * @return el valor de la descripcion
     */
    public String getDescripcion(){
        return descripcion;
        }
    /**
     * Este metodo te facilita la variable fecha
     *  
     * @return el valor de la fecha
     */    
    public String getFecha(){
        return fecha;
        }
        
    /**
    public String toString(){
        return String.format("%-10s %1d %5s %5s %5s %n %5s","ID ",id," Titulo: ", titulo, "descrpción: ",descripcion);
    }
    **/
}
