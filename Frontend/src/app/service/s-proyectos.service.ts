import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Proyectos } from '../model/proyectos';

@Injectable({
  providedIn: 'root'
})
export class SProyectosService {

  proURL = 'https://apmijanaddia.herokuapp.com/proye/'

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Proyectos[]>{
    return this.httpClient.get<Proyectos[]>(this.proURL + 'lista');
  }

  public detail(id: number): Observable<Proyectos>{
    return this.httpClient.get<Proyectos>(this.proURL + `detail/${id}`)
  }

  public save(proyectos:Proyectos): Observable<any>{
    return this.httpClient.post<any>(this.proURL +'create', proyectos);
  }

  public update(id: number, proyectos:Proyectos): Observable<any>{
    return this.httpClient.put<any>(this.proURL +`update/${id}`, proyectos);
  }
  
  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.proURL + `delete/${id}`);
  }
}
