"use strict";(self.webpackChunkapp=self.webpackChunkapp||[]).push([[8458],{8458:(f,l,o)=>{o.r(l),o.d(l,{LoginComponent:()=>_});var d=o(6895),m=o(6114),r=o(433),g=o(2340),n=o(8256),c=o(529),p=o(1407);let _=(()=>{class i{constructor(t,e){this.http=t,this.router=e,this.loginData={username:"",password:""}}login(){this.http.post(`${g.N.apiUrl}/api/auth/signin`,this.loginData).subscribe(e=>{"admin"===e.username?this.router.navigateByUrl("/admin"):e.username&&this.router.navigateByUrl(`/profesor/${e.username}`)},e=>{console.log(e)})}registro(){this.router.navigateByUrl("/singup")}ngOnInit(){}}return i.\u0275fac=function(t){return new(t||i)(n.Y36(c.eN),n.Y36(p.F0))},i.\u0275cmp=n.Xpm({type:i,selectors:[["app-login"]],standalone:!0,features:[n.jDz],decls:9,vars:3,consts:[[1,"login-container"],[3,"ngSubmit"],["loginForm","ngForm"],["type","email","name","email","placeholder","Nombre de usuario","required","",3,"ngModel","ngModelChange"],["type","password","name","password","placeholder","Contrase\xf1a","required","",3,"ngModel","ngModelChange"],["type","submit",3,"disabled"],[3,"click"]],template:function(t,e){if(1&t&&(n.TgZ(0,"div",0)(1,"form",1,2),n.NdJ("ngSubmit",function(){return e.login()}),n.TgZ(3,"input",3),n.NdJ("ngModelChange",function(s){return e.loginData.username=s}),n.qZA(),n.TgZ(4,"input",4),n.NdJ("ngModelChange",function(s){return e.loginData.password=s}),n.qZA(),n.TgZ(5,"button",5),n._uU(6,"Iniciar sesi\xf3n"),n.qZA(),n.TgZ(7,"button",6),n.NdJ("click",function(){return e.registro()}),n._uU(8,"registrarse"),n.qZA()()()),2&t){const a=n.MAs(2);n.xp6(3),n.Q6J("ngModel",e.loginData.username),n.xp6(1),n.Q6J("ngModel",e.loginData.password),n.xp6(1),n.Q6J("disabled",!a.form.valid)}},dependencies:[m.Pc,d.ez,r.u5,r._Y,r.Fj,r.JJ,r.JL,r.Q7,r.On,r.F],styles:[".login-container[_ngcontent-%COMP%]{display:flex;flex-direction:column;align-items:center;justify-content:center;height:100vh}form[_ngcontent-%COMP%]{display:flex;flex-direction:column;align-items:center;justify-content:center;padding:2rem;border:1px solid #ccc;border-radius:.5rem;box-shadow:0 2px 6px #0000004d;background-color:#f5f5f5}input[_ngcontent-%COMP%]{margin:.5rem 0;padding:.5rem;border-radius:.5rem;border:1px solid #ccc;width:100%;max-width:20rem}button[_ngcontent-%COMP%]{margin:1rem 0;padding:.5rem 1rem;border-radius:.5rem;border:none;background-color:#007bff;color:#fff;cursor:pointer;transition:background-color .3s ease}button[_ngcontent-%COMP%]:hover{background-color:#0062cc}"]}),i})()}}]);