import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Proyectos } from 'src/app/model/proyectos';
import { SProyectosService } from 'src/app/service/s-proyectos.service';

@Component({
  selector: 'app-edit-proyectos',
  templateUrl: './edit-proyectos.component.html',
  styleUrls: ['./edit-proyectos.component.css']
})
export class EditProyectosComponent implements OnInit {
  proye: Proyectos = null;

  constructor(private sProyectos: SProyectosService, private activatedRouter:ActivatedRoute, 
    private router: Router) { }

  ngOnInit(): void {
  const id= this.activatedRouter.snapshot.params['id'];
  this.sProyectos.detail(id).subscribe(
    data=>{
      this.proye = data;
    }, err =>{
      alert("Error al modificar Proyectos");
        this.router.navigate(['']);
    }
  )

  }
  
  onUpdate(): void{
    const id= this.activatedRouter.snapshot.params['id'];
    this.sProyectos.update(id, this.proye). subscribe(
      data=>{
        this.router.navigate(['']);
      }, err =>{
        alert("Error al modificar Proyectos");
        this.router.navigate(['']);
      }
    )
  }

}
