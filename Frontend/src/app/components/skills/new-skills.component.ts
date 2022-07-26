import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Skills } from 'src/app/model/skills';
import { SSkillsService } from 'src/app/service/s-skills.service';

@Component({
  selector: 'app-new-skills',
  templateUrl: './new-skills.component.html',
  styleUrls: ['./new-skills.component.css']
})
export class NewSkillsComponent implements OnInit {

  nombreS: string = '';
  porcentajeS: string = '';
  imagenS: string = '';

  constructor(private sSkill: SSkillsService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {    
    const skill = new Skills(this.nombreS, this.porcentajeS, this.imagenS);
    this.sSkill.save(skill).subscribe(
      data => {
      alert("Habilidad añadida");
      this.router.navigate(['']);
    }, err => {
      alert("Falló la creación de una nueva habilidad");
      this.router.navigate(['']);
    }
    )
  }

}
