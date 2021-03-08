package com.javatechie.crud.example.security;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.javatechie.crud.example.entity.Usuario;



@Repository
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService{

	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		
		Usuario usuario = new Usuario();
		usuario.setLogin("and");
		usuario.setSenha("and");
		
		if(usuario == null){
			throw new UsernameNotFoundException("Usuario não encontrado!");
		}
		return new User("and", new BCryptPasswordEncoder().encode("and"), true, true, true, true, usuario.getAuthorities());
	}

}