package EquipoDeFutbol;
import Fecha.fecha;
import Torneo.Equipo;

import java.util.HashSet;

public abstract class Jugador implements FicharJugador{
 private String nombre;
 private int FechaDeNacimiento;

 private Provincia provincia;
 private int numeroDeCamiseta;
 private HashSet<Club>equiposPorLosQuePaso;

 public Jugador(String nombre, int fechaDeNacimiento, Provincia provincia, int numeroDeCamiseta, HashSet<Club> equiposPorLosQuePaso) {
  this.nombre = nombre;
  FechaDeNacimiento = fechaDeNacimiento;
  this.provincia = provincia;
  this.numeroDeCamiseta = numeroDeCamiseta;
  this.equiposPorLosQuePaso = equiposPorLosQuePaso;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public int getFechaDeNacimiento() {
  return FechaDeNacimiento;
 }

 public void setFechaDeNacimiento(int fechaDeNacimiento) {
  FechaDeNacimiento = fechaDeNacimiento;
 }

 public Provincia getProvincia() {
  return provincia;
 }

 public void setProvincia(Provincia provincia) {
  this.provincia = provincia;
 }

 public int getNumeroDeCamiseta() {
  return numeroDeCamiseta;
 }

 public void setNumeroDeCamiseta(int numeroDeCamiseta) {
  this.numeroDeCamiseta = numeroDeCamiseta;
 }

 public HashSet<Club> getEquiposPorLosQuePaso() {
  return equiposPorLosQuePaso;
 }

 public void setEquiposPorLosQuePaso(HashSet<Club> equiposPorLosQuePaso) {
  this.equiposPorLosQuePaso = equiposPorLosQuePaso;
 }

 @Override
 public void contratar(){

 }
 public void renovar(){

 }

}
