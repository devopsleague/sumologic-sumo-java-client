/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.sumologic.client.searchjob.model;

import com.sumologic.client.model.HttpPostRequest;

public final class CreateSearchJobRequest implements HttpPostRequest {

    private String query;
    private String from;
    private String to;
    private String timeZone;
    private String byReceiptTime;
    private String intervalTimeType;
    private String autoParsingMode;
    private String parseMode;
    private Boolean requiresRawMessages;




    /**
     * Creates a search job request.
     *
     * @param query    The query.
     * @param from     The start of the time range.
     * @param to       The end of the time range.
     * @param timeZone The time zone.
     */
    public CreateSearchJobRequest(String query,
                                  String from,
                                  String to,
                                  String timeZone,
                                  String byReceiptTime,
                                  String intervalTimeType,
                                  String autoParsingMode,
                                  String parseMode,
                                  Boolean requiresRawMessages) {
        this.query = query;
        this.from = from;
        this.to = to;
        this.timeZone = timeZone;
        this.byReceiptTime = byReceiptTime;
        this.intervalTimeType = intervalTimeType;
        this.autoParsingMode = autoParsingMode;
        this.parseMode = parseMode;
        this.requiresRawMessages = requiresRawMessages;
    }

    /**
     * Returns the query.
     *
     * @return The query.
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the query.
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Sets the query.
     *
     * @return This object.
     */
    public CreateSearchJobRequest withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * Returns the start of the time range.
     *
     * @return The start of the time range.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the start of the time range.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets the start of the time range.
     *
     * @param from The start of the time range.
     * @return This object.
     */
    public CreateSearchJobRequest withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * Returns the end of the time range.
     *
     * @return The end of the time range.
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the end of the time range.
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets the end of the time range.
     *
     * @param to The end of the time range.
     * @return This object.
     */
    public CreateSearchJobRequest withTo(String to) {
        setTo(to);
        return this;
    }

    /**
     * Returns the time zone.
     *
     * @return The time zone.
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the time zone.
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Sets the time zone.
     *
     * @return This object.
     */
    public CreateSearchJobRequest withTimeZone(String timeZone) {
        setTimeZone(timeZone);
        return this;
    }

    /**
     * Returns the by receipt time flag.
     *
     * @return The by receipt time flag.
     */
    public String getByReceiptTime() {
        return byReceiptTime;
    }

    /**
     * Sets the by receipt time flag.
     */
    public void setByReceiptTime(String byReceiptTime) {
        this.byReceiptTime = byReceiptTime;
    }

    public Boolean getRequiresRawMessages() {
        return requiresRawMessages;
    }

    public void setRequiresRawMessages(Boolean requiresRawMessages) {
        this.requiresRawMessages = requiresRawMessages;
    }

    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public String getAutoParsingMode() {
        return autoParsingMode;
    }

    public void setAutoParsingMode(String autoParsingMode) {
        this.autoParsingMode = autoParsingMode;
    }

    public String getIntervalTimeType() {
        return intervalTimeType;
    }

    public void setIntervalTimeType(String intervalTimeType) {
        this.intervalTimeType = intervalTimeType;
    }


    /**
     * Sets the by receipt time flag.
     *
     * @return This object.
     */

    public CreateSearchJobRequest withByReceiptTime(String byReceiptTime) {
        setByReceiptTime(byReceiptTime);
        return this;
    }


    public CreateSearchJobRequest withIntervalTimeType(String intervalTimeType) {
        setIntervalTimeType(intervalTimeType);
        return this;
    }

    public CreateSearchJobRequest withAutoParsingMode(String autoParsingMode) {
        setAutoParsingMode(autoParsingMode);
        return this;
    }

    public CreateSearchJobRequest withParseMode(String parseMode) {
        setParseMode(parseMode);
        return this;
    }
    public CreateSearchJobRequest withRequiresRawMessages(Boolean requiresRawMessages) {
        setRequiresRawMessages(requiresRawMessages);
        return this;
    }

}
