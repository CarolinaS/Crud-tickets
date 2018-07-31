package com.tcs.crudtickets.helpdesk;

import java.util.List;

import com.tcs.crudtickets.model.Ticket;

public interface TicketHelpDesk {

	List<Ticket> listarTickets();

	Ticket getTicket(long idTicket);

	Ticket createTicket(Ticket ticket);

	Ticket updateTicket(Ticket ticket);

	Ticket deleteTicket(long idTicket);

}