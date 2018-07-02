/*******************************************************************************
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache Software License 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RequiredCapabilityTypeApiData } from './requiredCapabilityTypeApiData';
import { backendBaseURL } from '../../../configuration';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';

@Injectable()
export class RequiredCapabilityTypeService {

    path: string;

    constructor(private http: HttpClient,
                private route: Router) {
        this.path = backendBaseURL + this.route.url + '/';
    }

    getRequiredCapabilityTypeData(): Observable<RequiredCapabilityTypeApiData> {
        return this.http.get<RequiredCapabilityTypeApiData>(this.path);
    }

    save(requiredCapabilityType: string): Observable<HttpResponse<string>> {
        const headers = new HttpHeaders({ 'Content-Type': 'text/plain' });
        return this.http
            .put(
                this.path,
                requiredCapabilityType,
                { headers: headers, observe: 'response', responseType: 'text' }
            );
    }

    delete(): Observable<HttpResponse<string>> {
        return this.http
            .delete(
                this.path,
                { observe: 'response', responseType: 'text' }
            );
    }
}
