package com.cooweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.entity.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioDao usuarioDao;
	
	@RequestMapping(value="api/usuario")
	public List<Usuario> getUsuario(){
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		return user;
	}
	
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "Hola mundo";
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Jorge","Pedro","Martin");
	}

	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios(){
		Usuario usuario = new Usuario();
		usuario.setNombre("Ramiro");
		usuario.setApellido("Garro");
		usuario.setEmail("ramagarro@gmail.com");
		usuario.setPassword("123456");
		usuario.setTelefono("2616861215");
		usuario.setId(1L);
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id){
		Usuario usuario = new Usuario();
		usuario.setNombre("Ramiro");
		usuario.setApellido("Garro");
		usuario.setEmail("ramagarro@gmail.com");
		usuario.setPassword("123456");
		usuario.setTelefono("2616861215");
		usuario.setId(id);
		
		return usuario;
	}
	
	@RequestMapping(value="usuarios/lista_user")
	public List<Usuario> listar_variosUsuarios(){
		List<Usuario> usuario = new ArrayList<>();
		
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Ramiro");
		usuario1.setApellido("Garro");
		usuario1.setEmail("ramagarro@gmail.com");
		usuario1.setPassword("123456");
		usuario1.setTelefono("2616861215");
		usuario1.setId(1L);
		
		Usuario usuario2 = new Usuario();
		usuario2.setNombre("Franco");
		usuario2.setApellido("Martinez");
		usuario2.setEmail("franco@gmail.com");
		usuario2.setPassword("123456");
		usuario2.setTelefono("2616862225");
		usuario2.setId(2L);
		
		Usuario usuario3 = new Usuario();
		usuario3.setNombre("Ignacio");
		usuario3.setApellido("Meretta");
		usuario3.setEmail("ignamere@gmail.com");
		usuario3.setPassword("1222456");
		usuario3.setTelefono("261684445");
		usuario3.setId(3L);
		
		usuario.add(usuario1);
		usuario.add(usuario2);
		usuario.add(usuario3);

		return usuario;
	}
}
