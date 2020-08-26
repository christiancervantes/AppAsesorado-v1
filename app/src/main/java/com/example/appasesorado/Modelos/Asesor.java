package com.example.appasesorado.Modelos;

public class Asesor {
    private String uid;
    private String nombre;
    private String curso;
    private String skill;
    private String celular;
    private Double ratingValue;
    private Long ratingCount;
    private Long valoracion1;
    private String comentario;
    String estado;

    public Asesor() {
    }

    public Asesor(String uid, String nombre, String curso, String skill, String celular, Long valoracion1, String comentario, String estado) {
        this.uid = uid;
        this.nombre = nombre;
        this.curso = curso;
        this.skill = skill;
        this.celular = celular;
        this.valoracion1 = valoracion1;
        this.comentario = comentario;
        this.estado = estado;
    }

    public Long getValoracion1() {
        return valoracion1;
    }

    public void setValoracion1(Long valoracion1) {
        this.valoracion1 = valoracion1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Double getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(Double ratingValue) {
        this.ratingValue = ratingValue;
    }

    public Long getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Long ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
