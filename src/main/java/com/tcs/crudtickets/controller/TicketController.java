package com.tcs.crudtickets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.crudtickets.helpdesk.TicketHelpDesk;
import com.tcs.crudtickets.model.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketHelpDesk ticketHelpDesk;

	@GetMapping("/ticket") 
	public List<Ticket> listarTickets() {
		return ticketHelpDesk.listarTickets();
	}
	@GetMapping("/ticket/{idTicket}")
	public Ticket getTicket(@PathVariable("idTicket") long idTicket) {
		return ticketHelpDesk.getTicket(idTicket);
	}

	@PostMapping("/ticket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketHelpDesk.createTicket(ticket);
	}

	@PutMapping("/ticket")
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketHelpDesk.updateTicket(ticket);
	}

	@DeleteMapping("/ticket/{idTicket}")
	public Ticket deleteTicket(@PathVariable("idTicket") long idTicket) {
		return ticketHelpDesk.deleteTicket(idTicket);
	}
	
}