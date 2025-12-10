package org.example.exhibitiontimeslotbooking.dto.booking.response;

import org.example.exhibitiontimeslotbooking.common.enums.bookings.BookingStatus;
import org.example.exhibitiontimeslotbooking.entity.booking.Booking;

import java.time.LocalDateTime;

public record BookingDetailResponse(
        Long id,
        Long userId,
        Long timeslotId,
        Integer qty,
        Integer amount,
        BookingStatus status,
        LocalDateTime createdAt


) {
    public static BookingDetailResponse from(Booking booking){
        return new BookingDetailResponse(
                booking.getId(),
                booking.getUser().getId(),
                booking.getTimeslot().getId(),
                booking.getQty(),
                booking.getAmount(),
                booking.getStatus(),
                booking.getCreatedAt()
        );
    }
}
