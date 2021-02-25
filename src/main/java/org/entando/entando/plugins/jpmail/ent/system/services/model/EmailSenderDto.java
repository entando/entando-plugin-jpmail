/*
 * Copyright 2021-Present Entando S.r.l. (http://www.entando.com) All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package org.entando.entando.plugins.jpmail.ent.system.services.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class EmailSenderDto {

    public EmailSenderDto() {
    }

    public EmailSenderDto(@NotBlank(message = "error.emailSender.code.notBlank") String code,
                          @NotBlank(message = "error.emailSender.email.notBlank")
                          @Email(message = "error.emailSender.email.notValid") String email) {
        this.code = code;
        this.email = email;
    }

    @NotBlank(message = "emailSender.code.notBlank")
    private String code;

    @NotBlank(message = "emailSender.email.notBlank")
    @Email(message = "emailSender.email.notValid")
    private String email;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailSenderDto)) return false;
        EmailSenderDto that = (EmailSenderDto) o;
        return Objects.equals(getCode(), that.getCode()) &&
                Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getEmail());
    }

    @Override
    public String toString() {
        return "EmailSenderDto{" +
                "code='" + code + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
