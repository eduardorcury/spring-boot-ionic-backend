package com.eduardorib.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eduardorib.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);

}
