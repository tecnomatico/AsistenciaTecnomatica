package dominio;
// Generated 19/04/2013 09:18:43 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private Integer idEmpresa;
     private Integer cuit;
     private String denominacion;
     private String domicilio;
     private Date fechaInicio;
     private Set empleados = new HashSet(0);

    public Empresa() {
    }

    public Empresa(Integer cuit, String denominacion, String domicilio, Date fechaInicio, Set empleados) {
       this.cuit = cuit;
       this.denominacion = denominacion;
       this.domicilio = domicilio;
       this.fechaInicio = fechaInicio;
       this.empleados = empleados;
    }
   
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Integer getCuit() {
        return this.cuit;
    }
    
    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }
    public String getDenominacion() {
        return this.denominacion;
    }
    
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }




}


