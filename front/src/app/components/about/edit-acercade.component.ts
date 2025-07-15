import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { persona } from 'src/app/models/persona.model';
import { ImageService } from 'src/app/service/image.service';
import { PersonaService } from '../../service/persona.service';

@Component({
  selector: 'app-edit-acercade',
  templateUrl: './edit-acercade.component.html',
  styleUrls: ['./edit-acercade.component.css']
})
export class EditAcercadeComponent implements OnInit {
  persona: persona =null;


  constructor(
    private personaService: PersonaService,
    private activatedRouter : ActivatedRoute,
    private router: Router,
    public imageService: ImageService )
     { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.personaService.detail(id).subscribe(
      data =>{
        this.persona = data;
      }, err =>{
         alert("Error al modificar");
         this.router.navigate(['']);
      }
    )
  }
  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.persona.img = this.imageService.url;
    this.personaService.update(id, this.persona).subscribe(
      data => {
        this.router.navigate(['']);
      }, err => {
        alert("Error al editar");
        this.router.navigate(['']);
      }
    )
  }


  uploadImage($event: any){
  const id = this.activatedRouter.snapshot.params['id']
  const name = "perfil_" + id;
this.imageService.uploadImage($event, name)
  }
}
