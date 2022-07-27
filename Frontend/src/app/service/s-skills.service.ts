import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Skills } from '../model/skills';

@Injectable({
  providedIn: 'root'
})
export class SSkillsService {
    skillURL = 'https://apmijanaddia.herokuapp.com/skills/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Skills[]> {
    return this.httpClient.get<Skills[]>(this.skillURL + 'lista');
  }

  public detail(id: number): Observable<Skills> {
    return this.httpClient.get<Skills>(this.skillURL + `detail/${id}`);
  }

  public save(skills: Skills): Observable<any> {
    return this.httpClient.post<any>(this.skillURL + 'create', skills);
  }

  public update(id: number, skills: Skills): Observable<any> {
    return this.httpClient.put<any>(this.skillURL + `update/${id}`, skills);
  }

  public delete(id: number): Observable<any> {
    return this.httpClient.delete<any>(this.skillURL + `delete/${id}`);
  }
}
