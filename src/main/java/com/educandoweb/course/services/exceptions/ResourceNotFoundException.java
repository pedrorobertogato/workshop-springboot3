package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) { //ele vai procurar o id, caso não encontre o ResourceNotFoundException vai me retornar o id não encontrado, que mostra na linha 8
		super("Resource not found. Id" + id);
	}
}
