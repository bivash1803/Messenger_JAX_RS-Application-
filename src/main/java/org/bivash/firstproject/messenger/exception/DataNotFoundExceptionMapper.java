package org.bivash.firstproject.messenger.exception;

import org.bivash.firstproject.messenger.model.ErrorMessage;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;


@Provider 
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {
		
	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),404,"http://localhost:8080/messenger.bivash.org");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}
}
