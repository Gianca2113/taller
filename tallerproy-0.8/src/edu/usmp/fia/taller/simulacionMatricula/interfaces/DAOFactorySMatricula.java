package edu.usmp.fia.taller.simulacionMatricula.interfaces;

import java.util.List;

import edu.usmp.fia.taller.common.bean.SimulacionMatricula.*;

public interface DAOFactorySMatricula {

	//MATRICULA PROGRESIVA
	//ALUMNO
	public boolean GenerarPreMatricula(int codigoAlumno, List<Curso> listaCursos) throws Exception ;	
	public boolean EliminarPreMatricula(int correlativo) throws Exception ;
	public boolean InsertarPreMatricula(int correlativo,int idAlumno,String curso ,String seccion) throws Exception ;
	
	
	
	//ENCARGADO
	public List<Alumno> ListarAlumnos() throws Exception;	
	public List<Curso> ListarCursoObligatorios(int codAlumno) throws Exception;
	public List<Curso> ListarCursoCantAlumno() throws Exception;	
	public Curso ListarDetalleCurso(String curso) throws Exception;
	
	public List<Curso> ListarPreMatricula(int codigoAlumno) throws Exception ;
	
	
	//LOS DOS MODULOS(ENCARGADO Y ALUMNO)
	public List<Curso> CursosPropuestos(int codigoAlumno) throws Exception ;
	public List<Curso> ListarCursosAptos(int codAlumno) throws Exception;
	
	
	//SIMULACION DE MATRICULA
	public List<Area> SimulacionCursosPreferidos(int condicion) throws Exception;	
	public List<Area> SimulacionIncial(int condicion) throws Exception;
	public List<Area> SimulacionConcluyente(int condicion)throws Exception;	
	

	
}
