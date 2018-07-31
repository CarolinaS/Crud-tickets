package com.tcs.crudtickets.helpdesk;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.tcs.crudtickets.model.Ticket;

@Service
public class TicketHelpDeskImpl implements TicketHelpDesk {

	private static List<Ticket> tickets;

	@PostConstruct
	public void postConstruct() {
		tickets = new ArrayList<>();

		Ticket ticket = new Ticket();
		ticket.setId(1L);
		ticket.setAsunto("Activacion de Windows");

		Ticket ticket2 = new Ticket();
		ticket2.setId(2L);
		ticket2.setAsunto("Acceso al webmail");

		tickets.add(ticket);
		tickets.add(ticket2);
	}

	@Override
	public List<Ticket> listarTickets() {
		return tickets;
	}

	@Override
	public Ticket getTicket(long idTicket) {
		for (Ticket ticket : tickets) {
			if (ticket.getId() == idTicket) {
				return ticket;
			}
		}
		return null;
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		tickets.add(ticket);
		return ticket;
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		int index = getIndex(ticket.getId());
		if (index == -1) {
			return null;
		}
		tickets.set(index, ticket);
		return ticket;
	}

	private int getIndex(long idTicket) {
		for (int i = 0; i < tickets.size(); i++) {
			Ticket ticket = tickets.get(i);
			if (ticket.getId() == idTicket) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Ticket deleteTicket(long idTicket) {
		int index = getIndex(idTicket);
		if (index == -1) {
			return null;
		}
		return tickets.remove(index);
	}

}