package org.bivash.firstproject.messenger.exception;

import org.bivash.firstproject.messenger.model.ErrorMessage;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;


	
	@Provider 
	public class GenericExceptionMapper implements ExceptionMapper<Throwable> {
			
		@Override
		public Response toResponse(Throwable ex) {
			ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),500,"http://localhost:8080/messenger.bivash.org");
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(errorMessage)
					.build();
		}
	}


