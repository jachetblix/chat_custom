package com.egorovnaumenko.chat.client.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatControllerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Should add numbers correctly")
    void testAdd() {
        ChatController cm = new ChatController(null);
        int res = cm.add(1, 2);
        assertEquals(res, 3);
    }
}