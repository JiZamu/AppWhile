package com.mx.whileapp.dao;

public class EncProductoDTO {
    private Integer id_producto;
    private boolean resistor;
    private boolean cable_dupont;
    private boolean sensor_340k;
    private boolean l293d;
    private boolean l298p;
    private boolean l298nh;
    private boolean qrd1114;
    private boolean cny70;
    private boolean tcrt5000;
    private boolean placa_fenolica;
    private boolean protoboard;
    private boolean baterias_lipo;
    private boolean pic;
    private boolean avr;
    private boolean led;
    private boolean matriz;
    private String otros;
    private Integer persona;

    public EncProductoDTO() {
    }

    //Constructor personalizado para DAOhibernate ya que los demas datos no se usan
    public EncProductoDTO(boolean resistor, boolean cable_dupont, boolean sensor_340k, boolean l293d, boolean l298p, boolean l298nh, boolean qrd1114, boolean cny70, boolean tcrt5000, boolean placa_fenolica, boolean protoboard, boolean baterias_lipo, boolean pic, boolean avr, boolean led, boolean matriz, String otros) {
        this.resistor = resistor;
        this.cable_dupont = cable_dupont;
        this.sensor_340k = sensor_340k;
        this.l293d = l293d;
        this.l298p = l298p;
        this.l298nh = l298nh;
        this.qrd1114 = qrd1114;
        this.cny70 = cny70;
        this.tcrt5000 = tcrt5000;
        this.placa_fenolica = placa_fenolica;
        this.protoboard = protoboard;
        this.baterias_lipo = baterias_lipo;
        this.pic = pic;
        this.avr = avr;
        this.led = led;
        this.matriz = matriz;
        this.otros = otros;
    }

    public EncProductoDTO(Integer id_producto, boolean resistor, boolean cable_dupont, boolean sensor_340k, boolean l293d, boolean l298p, boolean l298nh, boolean qrd1114, boolean cny70, boolean tcrt5000, boolean placa_fenolica, boolean protoboard, boolean baterias_lipo, boolean pic, boolean avr, boolean led, boolean matriz, String otros, Integer persona) {
        this.id_producto = id_producto;
        this.resistor = resistor;
        this.cable_dupont = cable_dupont;
        this.sensor_340k = sensor_340k;
        this.l293d = l293d;
        this.l298p = l298p;
        this.l298nh = l298nh;
        this.qrd1114 = qrd1114;
        this.cny70 = cny70;
        this.tcrt5000 = tcrt5000;
        this.placa_fenolica = placa_fenolica;
        this.protoboard = protoboard;
        this.baterias_lipo = baterias_lipo;
        this.pic = pic;
        this.avr = avr;
        this.led = led;
        this.matriz = matriz;
        this.otros = otros;
        this.persona = persona;
    }
    
    

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public boolean isResistor() {
        return resistor;
    }

    public void setResistor(boolean resistor) {
        this.resistor = resistor;
    }

    public boolean isCable_dupont() {
        return cable_dupont;
    }

    public void setCable_dupont(boolean cable_dupont) {
        this.cable_dupont = cable_dupont;
    }

    public boolean isSensor_340k() {
        return sensor_340k;
    }

    public void setSensor_340k(boolean sensor_340k) {
        this.sensor_340k = sensor_340k;
    }

    public boolean isL293d() {
        return l293d;
    }

    public void setL293d(boolean l293d) {
        this.l293d = l293d;
    }

    public boolean isL298p() {
        return l298p;
    }

    public void setL298p(boolean l298p) {
        this.l298p = l298p;
    }

    public boolean isL298nh() {
        return l298nh;
    }

    public void setL298nh(boolean l298nh) {
        this.l298nh = l298nh;
    }

    public boolean isQrd1114() {
        return qrd1114;
    }

    public void setQrd1114(boolean qrd1114) {
        this.qrd1114 = qrd1114;
    }

    public boolean isCny70() {
        return cny70;
    }

    public void setCny70(boolean cny70) {
        this.cny70 = cny70;
    }

    public boolean isTcrt5000() {
        return tcrt5000;
    }

    public void setTcrt5000(boolean tcrt5000) {
        this.tcrt5000 = tcrt5000;
    }

    public boolean isPlaca_fenolica() {
        return placa_fenolica;
    }

    public void setPlaca_fenolica(boolean placa_fenolica) {
        this.placa_fenolica = placa_fenolica;
    }

    public boolean isProtoboard() {
        return protoboard;
    }

    public void setProtoboard(boolean protoboard) {
        this.protoboard = protoboard;
    }

    public boolean isBaterias_lipo() {
        return baterias_lipo;
    }

    public void setBaterias_lipo(boolean baterias_lipo) {
        this.baterias_lipo = baterias_lipo;
    }

    public boolean isPic() {
        return pic;
    }

    public void setPic(boolean pic) {
        this.pic = pic;
    }

    public boolean isAvr() {
        return avr;
    }

    public void setAvr(boolean avr) {
        this.avr = avr;
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    public boolean isMatriz() {
        return matriz;
    }

    public void setMatriz(boolean matriz) {
        this.matriz = matriz;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Integer getPersona() {
        return persona;
    }

    public void setPersona(Integer persona) {
        this.persona = persona;
    }
    
    
}
