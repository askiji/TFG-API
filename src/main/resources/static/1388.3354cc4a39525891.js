"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[1388],{1388:(f,_,s)=>{s.r(_),s.d(_,{SelectionComponent:()=>h});var a=s(6895),o=s(6114),p=s(2340),e=s(8256),u=s(529),m=s(1407);function g(i,l){if(1&i){const n=e.EpF();e.TgZ(0,"ion-item")(1,"ion-label",3),e.NdJ("click",function(){const c=e.CHM(n).$implicit,C=e.oxw();return e.KtG(C.setOpen(!0,c))}),e.qZA()()}if(2&i){const n=l.$implicit;e.xp6(1),e.Q6J("innerHTML",n.nombre,e.oJD)}}function d(i,l){if(1&i){const n=e.EpF();e.TgZ(0,"ion-header")(1,"ion-toolbar")(2,"ion-title"),e._uU(3,"Esta conforme para que le asignemos el horario del "),e._UZ(4,"div",4),e._uU(5,"?"),e.qZA()()(),e.TgZ(6,"ion-content",5)(7,"ion-button",6),e.NdJ("click",function(){e.CHM(n);const r=e.oxw();return e.KtG(r.seleccionar(r.profesorSelected))}),e._uU(8,"Aceptar"),e.qZA(),e.TgZ(9,"ion-button",6),e.NdJ("click",function(){e.CHM(n);const r=e.oxw();return e.KtG(r.setOpen(!1))}),e._uU(10,"Cerrar"),e.qZA()()}if(2&i){const n=e.oxw();e.xp6(4),e.Q6J("innerHTML",n.profesorSelected.nombre,e.oJD)}}let h=(()=>{class i{constructor(n,t){this._http=n,this.router=t,this.results=[],this.res=[],this.isModalOpen=!1}ngOnInit(){this.peticion()}peticion(){this._http.get(`${p.N.apiUrl}/profesores/sinasignar`).subscribe(n=>{console.log(n),this.res=n})}seleccionar(n){console.log(n),this._http.post(`${p.N.apiUrl}/profesores/asignar`,n).subscribe(t=>{console.log(t),this.router.navigateByUrl("/profesor/"+t.nombre),this.isModalOpen=!1})}handleInput(n){const t=n.target.value.toLowerCase();this.results=this.res.filter(r=>r.nombre.toLowerCase().indexOf(t)>-1)}setOpen(n,t){this.isModalOpen=n,this.profesorSelected=t}}return i.\u0275fac=function(n){return new(n||i)(e.Y36(u.eN),e.Y36(m.F0))},i.\u0275cmp=e.Xpm({type:i,selectors:[["app-selection"]],standalone:!0,features:[e.jDz],decls:6,vars:3,consts:[[3,"debounce","ionChange"],[4,"ngFor","ngForOf"],[3,"isOpen"],[3,"innerHTML","click"],[3,"innerHTML"],[1,"ion-padding"],[3,"click"]],template:function(n,t){1&n&&(e.TgZ(0,"ion-content")(1,"ion-searchbar",0),e.NdJ("ionChange",function(c){return t.handleInput(c)}),e.qZA(),e.TgZ(2,"ion-list"),e.YNc(3,g,2,1,"ion-item",1),e.qZA(),e.TgZ(4,"ion-modal",2),e.YNc(5,d,11,1,"ng-template"),e.qZA()()),2&n&&(e.xp6(1),e.Q6J("debounce",1e3),e.xp6(2),e.Q6J("ngForOf",t.results),e.xp6(1),e.Q6J("isOpen",t.isModalOpen))},dependencies:[o.Pc,o.YG,o.W2,o.Gu,o.Ie,o.Q$,o.q_,o.VI,o.wd,o.sr,o.ki,o.j9,a.ez,a.sg]}),i})()}}]);