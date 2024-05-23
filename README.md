# Ejercicio 3 - Facturación de llamadas

> **Grupo:** Kessler Andrés, Silenzi Manuel

## Enunciado

**Importante:** Aprobando este ejercicio, no será necesario rendir el tema Refactoring en el parcial.

**Fecha límite de entrega:** 24/05/2024 23:59 hs (máximo 2 integrantes por grupo).

En el material adicional encontrará una aplicación que registra y factura llamadas telefónicas. Para lograr tal
objetivo, la aplicación permite administrar números telefónicos, como así también clientes asociados a un número. Los
clientes pueden ser personas físicas o jurídicas. Además, el sistema permite registrar las llamadas realizadas, las
cuales pueden ser nacionales o internacionales. Luego, a partir de las llamadas, la aplicación realiza la facturación,
es decir, calcula el monto que debe abonar cada cliente.

Importe el material adicional provisto por la cátedra y analícelo para identificar y corregir los malos olores que
presenta. En forma iterativa, realice los siguientes pasos:

1. Indique el mal olor.
2. Indique el refactoring que lo corrige.
3. Aplique el refactoring (modifique el código).
4. Asegúrese que los test provistos corran exitosamente.

Si vuelve a encontrar un mal olor, retorne al paso (1.).

Usted debe entregar:

- Un diagrama de clases UML con el diseño inicial de la solución provista.
- La secuencia de refactorings aplicados, documentados cada uno de la siguiente manera:
    - Mal olor detectado en el código.
    - Extracto del código que presenta el mal olor.
    - Refactoring a aplicar que resuelve el mal olor.
    - Código con el refactoring aplicado.
- Un diagrama de clases UML con el diseño final.
- El código Java refactorizado.

**Importante:** asegúrese que no queden malos olores por identificar y refactorizar.

---

## Diagrama UML de la solución original

<?xml version="1.0" encoding="us-ascii" standalone="no"?><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" contentStyleType="text/css" height="964px" preserveAspectRatio="none" style="width:813px;height:964px;background:#FFFFFF;" version="1.1" viewBox="0 0 813 964" width="813px" zoomAndPan="magnify"><defs/><g><!--class Cliente--><g id="elem_Cliente"><rect codeLine="2" fill="#F1F1F1" height="334.0188" id="Cliente" rx="2.5" ry="2.5" style="stroke:#181818;stroke-width:0.5;" width="327" x="35" y="325"/><ellipse cx="170.75" cy="341" fill="#ADD1B2" rx="11" ry="11" style="stroke:#181818;stroke-width:1.0;"/><path d="M168.6563,340.8438 Q168.6563,342.7188 169.2344,343.7344 Q169.8125,344.7344 170.9688,344.7344 Q172.3125,344.7344 172.9688,342.7188 L175.2344,343.1406 Q174.125,346.6719 170.9531,346.6719 Q168.6094,346.6719 167.3906,345.1875 Q166.1719,343.7031 166.1719,340.8438 Q166.1719,335.125 170.875,335.125 Q172.4219,335.125 173.4531,335.9375 Q174.5,336.75 175,338.3594 L172.7344,338.9063 Q172.5,338.0313 172.0156,337.5469 Q171.5313,337.0469 170.9063,337.0469 Q168.6563,337.0469 168.6563,340.8438 Z " fill="#000000"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="47" x="191.25" y="346.432">Cliente</text><line style="stroke:#181818;stroke-width:0.5;" x1="36" x2="361" y1="357" y2="357"/><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="43" y="369.034"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="75" x="55" y="375.9659">tipo: String</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="43" y="388.1019"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="102" x="55" y="395.0339">nombre: String</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="43" y="407.1698"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="160" x="55" y="414.1018">numeroTelefono: String</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="43" y="426.2377"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="74" x="55" y="433.1697">cuit: String</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="43" y="445.3056"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="71" x="55" y="452.2376">dni: String</text><line style="stroke:#181818;stroke-width:0.5;" x1="36" x2="361" y1="460.3396" y2="460.3396"/><ellipse cx="46" cy="475.3735" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="108" x="55" y="479.3055">getTipo(): String</text><ellipse cx="46" cy="494.4415" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="132" x="55" y="498.3734">setTipo(tipo: String)</text><ellipse cx="46" cy="513.5094" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="134" x="55" y="517.4414">getNombre(): String</text><ellipse cx="46" cy="532.5773" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="185" x="55" y="536.5093">setNombre(nombre: String)</text><ellipse cx="46" cy="551.6452" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="192" x="55" y="555.5772">getNumeroTelefono(): String</text><ellipse cx="46" cy="570.7131" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="301" x="55" y="574.6451">setNumeroTelefono(numeroTelefono: String)</text><ellipse cx="46" cy="589.781" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="106" x="55" y="593.713">getCuit(): String</text><ellipse cx="46" cy="608.849" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="129" x="55" y="612.7809">setCuit(cuit: String)</text><ellipse cx="46" cy="627.9169" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="105" x="55" y="631.8489">getDNI(): String</text><ellipse cx="46" cy="646.9848" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="125" x="55" y="650.9168">setDNI(dni: String)</text></g><!--class Llamada--><g id="elem_Llamada"><rect codeLine="22" fill="#F1F1F1" height="219.6113" id="Llamada" rx="2.5" ry="2.5" style="stroke:#181818;stroke-width:0.5;" width="617" x="7" y="738"/><ellipse cx="282.75" cy="754" fill="#ADD1B2" rx="11" ry="11" style="stroke:#181818;stroke-width:1.0;"/><path d="M280.6563,753.8438 Q280.6563,755.7188 281.2344,756.7344 Q281.8125,757.7344 282.9688,757.7344 Q284.3125,757.7344 284.9688,755.7188 L287.2344,756.1406 Q286.125,759.6719 282.9531,759.6719 Q280.6094,759.6719 279.3906,758.1875 Q278.1719,756.7031 278.1719,753.8438 Q278.1719,748.125 282.875,748.125 Q284.4219,748.125 285.4531,748.9375 Q286.5,749.75 287,751.3594 L284.7344,751.9063 Q284.5,751.0313 284.0156,750.5469 Q283.5313,750.0469 282.9063,750.0469 Q280.6563,750.0469 280.6563,753.8438 Z " fill="#000000"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="57" x="303.25" y="759.432">Llamada</text><line style="stroke:#181818;stroke-width:0.5;" x1="8" x2="623" y1="770" y2="770"/><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="15" y="782.034"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="150" x="27" y="788.9659">tipoDeLlamada: String</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="15" y="801.1019"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="93" x="27" y="808.0339">origen: String</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="15" y="820.1698"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="99" x="27" y="827.1018">destino: String</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="15" y="839.2377"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="118" x="27" y="846.1697">duracion: Integer</text><line style="stroke:#181818;stroke-width:0.5;" x1="8" x2="623" y1="854.2717" y2="854.2717"/><ellipse cx="18" cy="869.3056" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="591" x="27" y="873.2376">&#171;create&#187; Llamada(tipoLlamada: String, origen: String, destino: String, duracion: Integer)</text><ellipse cx="18" cy="888.3735" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="183" x="27" y="892.3055">getTipoDeLlamada(): String</text><ellipse cx="18" cy="907.4415" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="148" x="27" y="911.3734">getRemitente(): String</text><ellipse cx="18" cy="926.5094" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="149" x="27" y="930.4414">getDuracion(): Integer</text><ellipse cx="18" cy="945.5773" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="126" x="27" y="949.5093">getOrigen(): String</text></g><!--class GestorNumerosDisponibles--><g id="elem_GestorNumerosDisponibles"><rect codeLine="36" fill="#F1F1F1" height="143.3396" id="GestorNumerosDisponibles" rx="2.5" ry="2.5" style="stroke:#181818;stroke-width:0.5;" width="272" x="534.5" y="420.5"/><ellipse cx="574.25" cy="436.5" fill="#ADD1B2" rx="11" ry="11" style="stroke:#181818;stroke-width:1.0;"/><path d="M572.1563,436.3438 Q572.1563,438.2188 572.7344,439.2344 Q573.3125,440.2344 574.4688,440.2344 Q575.8125,440.2344 576.4688,438.2188 L578.7344,438.6406 Q577.625,442.1719 574.4531,442.1719 Q572.1094,442.1719 570.8906,440.6875 Q569.6719,439.2031 569.6719,436.3438 Q569.6719,430.625 574.375,430.625 Q575.9219,430.625 576.9531,431.4375 Q578,432.25 578.5,433.8594 L576.2344,434.4063 Q576,433.5313 575.5156,433.0469 Q575.0313,432.5469 574.4063,432.5469 Q572.1563,432.5469 572.1563,436.3438 Z " fill="#000000"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="185" x="593.75" y="441.932">GestorNumerosDisponibles</text><line style="stroke:#181818;stroke-width:0.5;" x1="535.5" x2="805.5" y1="452.5" y2="452.5"/><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="542.5" y="464.534"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="107" x="554.5" y="471.4659">lineas: String[*]</text><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="542.5" y="483.6019"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="147" x="554.5" y="490.5339">tipoGenerador: String</text><line style="stroke:#181818;stroke-width:0.5;" x1="535.5" x2="805.5" y1="498.6358" y2="498.6358"/><ellipse cx="545.5" cy="513.6698" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="140" x="554.5" y="517.6018">getLineas(): String[*]</text><ellipse cx="545.5" cy="532.7377" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="199" x="554.5" y="536.6697">obtenerNumeroLibre(): String</text><ellipse cx="545.5" cy="551.8056" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="246" x="554.5" y="555.7376">cambiarTipoGenerador(valor: String)</text></g><!--class Empresa--><g id="elem_Empresa"><rect codeLine="46" fill="#F1F1F1" height="238.6792" id="Empresa" rx="2.5" ry="2.5" style="stroke:#181818;stroke-width:0.5;" width="607" x="129" y="7"/><ellipse cx="398.75" cy="23" fill="#ADD1B2" rx="11" ry="11" style="stroke:#181818;stroke-width:1.0;"/><path d="M396.6563,22.8438 Q396.6563,24.7188 397.2344,25.7344 Q397.8125,26.7344 398.9688,26.7344 Q400.3125,26.7344 400.9688,24.7188 L403.2344,25.1406 Q402.125,28.6719 398.9531,28.6719 Q396.6094,28.6719 395.3906,27.1875 Q394.1719,25.7031 394.1719,22.8438 Q394.1719,17.125 398.875,17.125 Q400.4219,17.125 401.4531,17.9375 Q402.5,18.75 403,20.3594 L400.7344,20.9063 Q400.5,20.0313 400.0156,19.5469 Q399.5313,19.0469 398.9063,19.0469 Q396.6563,19.0469 396.6563,22.8438 Z " fill="#000000"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="59" x="419.25" y="28.432">Empresa</text><line style="stroke:#181818;stroke-width:0.5;" x1="130" x2="735" y1="39" y2="39"/><polygon fill="none" points="140,50.034,136,56.034,144,56.034" style="stroke:#1963A0;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" text-decoration="underline" textLength="130" x="149" y="57.9659">descuentoJur: Real;</text><polygon fill="none" points="140,69.1019,136,75.1019,144,75.1019" style="stroke:#1963A0;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" text-decoration="underline" textLength="129" x="149" y="77.0339">descuentoFis: Real;</text><line style="stroke:#181818;stroke-width:0.5;" x1="130" x2="735" y1="85.1358" y2="85.1358"/><ellipse cx="140" cy="100.1698" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="304" x="149" y="104.1018">agregarNumeroTelefono(str: String): Boolean</text><ellipse cx="140" cy="119.2377" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="199" x="149" y="123.1697">obtenerNumeroLibre(): String</text><ellipse cx="140" cy="138.3056" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="446" x="149" y="142.2376">registrarUsuario(data: String, nombre: String, tipo: String): Cliente</text><ellipse cx="140" cy="157.3735" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="581" x="149" y="161.3055">registrarLlamada(origen: Cliente, destino: Client, t: String, duracion: Integer): Llamada</text><ellipse cx="140" cy="176.4415" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="338" x="149" y="180.3734">calcularMontoTotalLlamadas(cliente: Cliente): Real</text><ellipse cx="140" cy="195.5094" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="202" x="149" y="199.4414">cantidadDeUsuarios(): Integer</text><ellipse cx="140" cy="214.5773" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="271" x="149" y="218.5093">existeUsuario(persona: Cliente): Boolean</text><ellipse cx="140" cy="233.6452" fill="#84BE84" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="14" lengthAdjust="spacing" textLength="329" x="149" y="237.5772">getGestorNumeros(): GestorNumerosDisponibles</text></g><!--link Cliente to Llamada--><g id="link_Cliente_Llamada"><path codeLine="63" d="M253.49,659.38 C262.27,685.94 269.2664,707.1233 277.4664,731.9233 " fill="none" id="Cliente-to-Llamada" style="stroke:#181818;stroke-width:1.0;"/><polygon fill="#181818" points="279.35,737.62,280.3224,727.8193,277.7804,732.8728,272.7268,730.3307,279.35,737.62" style="stroke:#181818;stroke-width:1.0;"/><ellipse cx="273.5" cy="699.353" fill="none" rx="3" ry="3" style="stroke:#038048;stroke-width:1.0;"/><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="53" x="280.5" y="703.897">llamadas</text><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="7" x="248.6622" y="680.7114">1</text><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="7" x="269.5621" y="726.1968">*</text></g><!--link Empresa to Cliente--><g id="link_Empresa_Cliente"><path codeLine="65" d="M356.04,246.27 C339.91,271.33 325.8476,293.1749 308.8276,319.6149 " fill="none" id="Empresa-to-Cliente" style="stroke:#181818;stroke-width:1.0;"/><polygon fill="#181818" points="305.58,324.66,313.8148,319.2575,308.2864,320.4558,307.0881,314.9273,305.58,324.66" style="stroke:#181818;stroke-width:1.0;"/><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="339.5" y="283.353"/><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="45" x="349.5" y="290.897">clientes</text><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="7" x="344.4173" y="267.6123">1</text><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="7" x="303.5972" y="313.0564">*</text></g><!--link Empresa to Llamada--><g id="link_Empresa_Llamada"><path codeLine="66" d="M428.42,246.4 C422.86,354.92 409.84,519.22 379.5,659 C373.87,684.94 367.7193,706.5952 359.2393,732.1552 " fill="none" id="Empresa-to-Llamada" style="stroke:#181818;stroke-width:1.0;"/><polygon fill="#181818" points="357.35,737.85,363.9805,730.5674,358.9245,733.1044,356.3875,728.0483,357.35,737.85" style="stroke:#181818;stroke-width:1.0;"/><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="426.5" y="489.853"/><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="53" x="436.5" y="497.397">llamadas</text><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="7" x="420.9818" y="267.7498">1</text><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="7" x="353.1663" y="726.0739">*</text></g><!--link Empresa to GestorNumerosDisponibles--><g id="link_Empresa_GestorNumerosDisponibles"><path codeLine="67" d="M510.27,246.27 C547.9,303.75 588.5237,365.79 620.8437,415.16 " fill="none" id="Empresa-to-GestorNumerosDisponibles" style="stroke:#181818;stroke-width:1.0;"/><polygon fill="#181818" points="624.13,420.18,622.5472,410.4592,621.3914,415.9967,615.8539,414.8409,624.13,420.18" style="stroke:#181818;stroke-width:1.0;"/><rect fill="none" height="6" style="stroke:#C82930;stroke-width:1.0;" width="6" x="539.5" y="283.353"/><text fill="#000000" font-family="sans-serif" font-size="13" lengthAdjust="spacing" textLength="26" x="549.5" y="290.897">guia</text></g><!--SRC=[ZLJ1Rjim33rNNo7a53VnOTUio67nLdJ8Eg3BJiKEZCmP0cGfaEHXGD5z-oHBicKx7PPJy4W-ae_FOWACeGV1KLgaBuIwNqajlwWT_MOrbqs4f6hF6kTWrw9M9nJuKybv1UkudK6rv0D2RZQqGNjohTR5W3hGH30VeeZPZ_qKY_m8JsSSQYP3BckduUih9Qw3ssd1q8FvjYcxUdnO97iiaw4WhuGGrb_XAA256jmLRi89AepGo55IfNc3CaTgD9Pdydkeqy2uScaFxguDwbxkkpkc4IpkzwbNB_AioNRMOZjli5tI5zarXwcdkxle4xRSUgCj8bKaz84qSOXyxMV92aQzxjrOIeVxcOgRYvByBD040GMN22QLFT_-IAhUeqGDjT9pAnxxYh5LNxEXwcnzHUXpv0l_CMZF7FGffrx_0Z4so8_yiRreDFsH_z0NOy5ozkeLPfrJHdtkNDKJWdX_FVw9cnJtlQ7Hs82UUTZOiVMEVb1A8CZ_MSMHSLSC-hlfG7Erhi5clfX-Nzl9C-5uuYio8KfMI9QAEPcd0kB8_cMlNJ9i45omJe3-efmW9sL1nA1Piq0_z2c2MA5AMbv3NM5SpipCXh_To2culg0sIaBEb0dft39ndwTwouxzyGb9R-pgtOgMvPwkRbV35x-Z6ohY3eGaY-IPXxIOUrV3NtCrR_YMov4mvVcSjuRq1Kt7WVm5]--></g></svg>

---

## Refactoring 1

### Mal olor

La clase `Cliente` es una *clase anémica* que solo posee datos y sus getters y setters porque la clase `Empresa`
tiene envidia de atributos y usa sus datos para registrar las llamadas y calcular el monto total de las llamadas.

Esto es un problema porque la clase `Empresa` no cumple con el principio de responsabilidad única y es muy grande, ya
que resuelve cosas de las que no es responsable. Además, la clase `Cliente` provee getters y setters públicos para
todos sus atributos lo que da demasiada visibilidad al resto del programa; esto puede no ser un problema, pero es
conveniente reducir la visibilidad lo máximo posible.

### Extracto del código que presenta el mal olor

```java
public class Cliente {
    public List<Llamada> llamadas = new ArrayList<Llamada>();
    private String tipo;
    private String nombre;
    private String numeroTelefono;
    private String cuit;
    private String dni;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // mas getters y setters para los demás atributos
}
```

```java
public class Empresa {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Llamada> llamadas = new ArrayList<Llamada>();
    private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

    static double descuentoJur = 0.15;
    static double descuentoFis = 0;

    // ...

    public Llamada registrarLlamada(Cliente origen, Cliente destino, String t, int duracion) {
        Llamada llamada = new Llamada(t, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
        llamadas.add(llamada);
        origen.llamadas.add(llamada);
        return llamada;
    }

    public double calcularMontoTotalLlamadas(Cliente cliente) {
        double c = 0;
        for (Llamada l : cliente.llamadas) {
            double auxc = 0;
            if (l.getTipoDeLlamada() == "nacional") {
                // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
                auxc += l.getDuracion() * 3 + (l.getDuracion() * 3 * 0.21);
            } else if (l.getTipoDeLlamada() == "internacional") {
                // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
                auxc += l.getDuracion() * 150 + (l.getDuracion() * 150 * 0.21) + 50;
            }

            if (cliente.getTipo() == "fisica") {
                auxc -= auxc * descuentoFis;
            } else if (cliente.getTipo() == "juridica") {
                auxc -= auxc * descuentoJur;
            }
            c += auxc;
        }
        return c;
    }
}
```

### Refactoring a aplicar que resuelve el mal olor

Vamos a aplicar ***Move Method*** para mover los métodos `registrarLlamada()` y `calcularMontoTotalLLamadas()` desde
la clase `Empresa` a la clase `Cliente`. Para hacer esto también será necesario mover las variables de clase
`descuentoJur` y `descuentoFis` a la clase `Cliente`, lo cual es lógico porque los descuentos son específicos del
tipo de cliente.

Mantendremos los métodos en la clase `Empresa` para evitar modificar la interfaz de dicha clase, pero estos métodos
ahora delegarán su tarea en los nuevos métodos de la clase `Cliente`.

Además, aprovechando que estamos modificando estos métodos, vamos a aplicar ***Rename Field*** para renombrar al
parámetro `t` por `tipo`, ya que consideramos que es más descriptivo.

Finalmente, marcaremos al método `calcularMontoTotalLlamadas()` como obsoleto (*deprecated*), puesto que consideramos
que es preferible utilizar este método directamente desde el cliente. No lo borramos, aplicando ***Remove Middle Man***,
para evitar modificar la interfaz de la clase `Cliente` y los test; sin embargo, al marcarlo como obsoleto, dejamos el
terreno preparado para hacerlo fácilmente en un futuro.

### Código con el refactoring aplicado

```java
public class Cliente {
    // Variables de instancia...

    static double descuentoJur = 0.15;
    static double descuentoFis = 0;

    public Llamada registrarLlamada(Cliente destino, String tipo, int duracion) {
        Llamada llamada = new Llamada(tipo, this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
        this.llamadas.add(llamada);
        return llamada;
    }

    public double calcularMontoTotalLlamadas() {
        double c = 0;
        for (Llamada l : this.llamadas) {
            double auxc = 0;
            if (l.getTipoDeLlamada() == "nacional") {
                // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
                auxc += l.getDuracion() * 3 + (l.getDuracion() * 3 * 0.21);
            } else if (l.getTipoDeLlamada() == "internacional") {
                // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
                auxc += l.getDuracion() * 150 + (l.getDuracion() * 150 * 0.21) + 50;
            }

            if (this.getTipo() == "fisica") {
                auxc -= auxc * descuentoFis;
            } else if (this.getTipo() == "juridica") {
                auxc -= auxc * descuentoJur;
            }
            c += auxc;
        }
        return c;
    }

    // Getters y setters...
}
```

```java
public class Empresa {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Llamada> llamadas = new ArrayList<Llamada>();
    private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

    // ...

    public Llamada registrarLlamada(Cliente origen, Cliente destino, String tipo, int duracion) {
        Llamada llamada = origen.registrarLlamada(destino, tipo, duracion);
        llamadas.add(llamada);
        return llamada;
    }

    @Deprecated
    public double calcularMontoTotalLlamadas(Cliente cliente) {
        return cliente.calcularMontoTotalLlamadas();
    }

    // ...
}
```

---

## Refactoring 2

### Mal olor

La variable de instancia `llamadas` en la clase `Empresa` no tiene mucho sentido. Cada cliente ya conoce todas
sus llamadas, y tiene sentido que así sea. Esta variable de instancia no solo genera duplicación de información,
sino que además sus valores no se utilizan, solo agregamos las llamadas a la lista, pero luego no utilizamos esta
información para procesar nada.

### Extracto del código que presenta el mal olor

```java
public class Empresa {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Llamada> llamadas = new ArrayList<Llamada>();
    private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

    public Llamada registrarLlamada(Cliente origen, Cliente destino, String tipo, int duracion) {
        Llamada llamada = origen.registrarLlamada(destino, tipo, duracion);
        llamadas.add(llamada);  // Único uso de la variable de instancia `llamadas`
        return llamada;
    }
    // Otros métodos...
}

```

### Refactoring a aplicar que resuelve el mal olor

Vamos a eliminar la variable de instancia `llamadas` de la clase `Empresa`. Al hacer esto tenemos que modificar el
método `registrarLlamada()`, que ahora únicamente delegará su tarea en el cliente de origen; por ello, siguiendo con el
mismo criterio que en el refactoring anterior, marcaremos a este método como obsoleto.

### Código con el refactoring aplicado

```java
public class Empresa {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

    @Deprecated
    public Llamada registrarLlamada(Cliente origen, Cliente destino, String tipo, int duracion) {
        return origen.registrarLlamada(destino, tipo, duracion);
    }
    // Otros métodos...
}
```

---

## Refactoring 3

### Mal olor

El método `calcularMontoTotalLlamadas()` de la clase `Cliente` es un *método largo* que realiza varias tareas. Se
encarga de recorrer todas las llamadas del cliente y, para cada llamada, calcula el costo y el descuento que se debe
aplicar.

Además, el recorrido de la lista de llamadas se hace utilizando un for-each y consideramos es mejor utilizar *streams*,
ya que se mejora la legibilidad y no tenemos que andar reinventando la rueda.

### Extracto del código que presenta el mal olor

```java
public class Cliente {
    // ...
    public double calcularMontoTotalLlamadas() {
        double c = 0;
        for (Llamada l : this.llamadas) {
            double auxc = 0;
            if (l.getTipoDeLlamada() == "nacional") {
                // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
                auxc += l.getDuracion() * 3 + (l.getDuracion() * 3 * 0.21);
            } else if (l.getTipoDeLlamada() == "internacional") {
                // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
                auxc += l.getDuracion() * 150 + (l.getDuracion() * 150 * 0.21) + 50;
            }

            if (this.getTipo() == "fisica") {
                auxc -= auxc * descuentoFis;
            } else if (this.getTipo() == "juridica") {
                auxc -= auxc * descuentoJur;
            }
            c += auxc;
        }
        return c;
    }
    // ...
}
```

### Refactoring a aplicar que resuelve el mal olor

Para mejorar este método vamos a aplicar varios cambios.

Primero vamos a aplicar ***Extract Method*** para separar el recorrido de la lista de la operación a aplicar sobre
cada elemento. Para ello, vamos a crear un nuevo método `calcularMontoTotalLlamada()` que se encargará de calcular
el monto de cada llamada de forma individual.

Luego utilizaremos ***Substitute Algorithm*** para simplificar ligeramente la lógica que se utiliza para calcular
los montos.

Después vamos a utilizar ***Extract Method*** nuevamente en el nuevo método para crear dos métodos más:
`calcularMontoLlamada()`, que se encargará de calcular el monto de una llamada, y `aplicarDescuento()`, que se
encargará de calcular el monto con el que se debe aplicar.

Finalmente, emplearemos ***Replace Loop with Pipeline*** para deshacernos del bucle for-each.

### Código con el refactoring aplicado

```java
public class Cliente {
    // ...
    public double calcularMontoTotalLlamadas() {
        return this.llamadas.stream().mapToDouble(this::calcularMontoTotalLlamada).sum();
    }

    private double calcularMontoTotalLlamada(Llamada l) {
        return aplicarDescuento(calcularMontoLlamada(l));
    }

    private double calcularMontoLlamada(Llamada l) {
        if (l.getTipoDeLlamada() == "nacional") {
            // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
            return l.getDuracion() * 3 * 1.21;
        } else if (l.getTipoDeLlamada() == "internacional") {
            // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
            return l.getDuracion() * 150 * 1.21 + 50;
        }
        return 0;
    }

    private double aplicarDescuento(double monto) {
        if (this.getTipo() == "fisica") {
            return monto * (1 - descuentoFis);
        } else if (this.getTipo() == "juridica") {
            return monto * (1 - descuentoJur);
        }
        return monto;
    }
    // ...
}
```

---

## Refactoring 4

### Mal olor

Ahora que extrajimos el cálculo del costo de una llamada al método `calcularMontoLlamada()` podemos ver claramente
que la clase `Cliente` tiene envidia de atributos de la clase Llamada. Esto es un problema porque la clase `Cliente`
se encarga de hacer cosas (calcular el costo de una llamada) que deberían ser responsabilidad de la clase `Llamada`.
Además, actualmente nuestra clase `Llamada` está anémica, ya que no tiene ninguna responsabilidad.

### Extracto del código que presenta el mal olor

```java
public class Cliente {
    // ...
    private double calcularMontoTotalLlamada(Llamada l) {
        return aplicarDescuento(calcularMontoLlamada(l));
    }

    private double calcularMontoLlamada(Llamada l) {
        if (l.getTipoDeLlamada() == "nacional") {
            // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
            return l.getDuracion() * 3 * 1.21;
        } else if (l.getTipoDeLlamada() == "internacional") {
            // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
            return l.getDuracion() * 150 * 1.21 + 50;
        }
        return 0;
    }
    // ...
}
```

### Refactoring a aplicar que resuelve el mal olor

Para resolver este mal olor aplicaremos ***Move Method*** para mover el método `calcularMontoLlamada()` desde la
clase `Cliente` a la clase `Llamada` y después renombraremos el método a `calcularMonto()` y mejoramos los nombres
de los parámetros.

### Código con el refactoring aplicado

```java
public class Cliente {
    // ...
    private double calcularMontoTotalLlamada(Llamada llamada) {
        return aplicarDescuento(llamada.calcularMonto());
    }
    // ...
}
```

```java
public class Llamada {
    // ...
    public double calcularMonto() {
        if (this.getTipoDeLlamada() == "nacional") {
            // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
            return this.getDuracion() * 3 * 1.21;
        }
        if (this.getTipoDeLlamada() == "internacional") {
            // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
            return this.getDuracion() * 150 * 1.21 + 50;
        }
        return 0;
    }
}
//...
```

---

## Refactoring 5

### Mal olor

En el método `calcularMonto()` de la clase `Llamada` utilizamos un `if` que pregunta por un tipo para determinar la
forma en la que calculamos el monto. Esto es un problema porque no se aprovecha el polimorfismo y hace más compleja
a la clase `Llamada`.

### Extracto del código que presenta el mal olor

```java
public class Llamada {
    private String tipoDeLlamada;

    // ...
    public double calcularMonto() {
        if (this.getTipoDeLlamada() == "nacional") {
            // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
            return this.getDuracion() * 3 * 1.21;
        }
        if (this.getTipoDeLlamada() == "internacional") {
            // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
            return this.getDuracion() * 150 * 1.21 + 50;
        }
        return 0;
    }

    // ...
    public String getTipoDeLlamada() {
        return tipoDeLlamada;
    }
}

```

### Refactoring a aplicar que resuelve el mal olor

Para resolver este mal olor aplicaremos ***Replace Conditional with Polymorphism***. Transformaremos la clase `Llamada`
en una clase abstracta de la que extienden dos nuevas subclases: `LlamadaNacional` y `LlamadaInternacional`.
Luego haremos que el método `calcularMonto()` sea abstracto para que cada una de las subclases lo implemente de
acuerdo a lo que necesita.

Al realizar estos cambios ya no podremos instanciar a `Llamada`, puesto que es una clase abstracta. Para solucionar
esto añadiremos tres métodos a la clase `Cliente`:

- `_registrarLlamada()`: un método privado que se encargará de manejar la lógica de registrar una llamada.
- `registrarLlamadaNacional()`: un método público que se encargará de crear una llamada nacional y se la pasará a
  `_registrarLlamada()` para que la registre.
- `registrarLlamadaInternacional()`: un método público que se encargará de crear una llamada internacional y se la
  pasará a `_registrarLlamada()` para que la registre.

Finalmente, modificaremos al método `registrarLlamada()` para que se encargue de llamar a `registrarLlamadaNacional()`
o `registrarLlamadaInternacional()` según corresponda. Marcaremos este método como *obsoleto* porque consideramos
que es preferible utilizar alguno de los nuevos métodos, pero no lo borramos porque no queremos modificar la interfaz
de la clase `Cliente`.

### Código con el refactoring aplicado

```java
public abstract class Llamada {
    private String origen;
    private String destino;
    private int duracion;

    public Llamada(String origen, String destino, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public abstract double calcularMonto();

    // Getters y setters (sin getTipoDeLlamada())
}
```

```java
public class LlamadaNacional extends Llamada {
    public LlamadaNacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    public double calcularMonto() {
        // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
        return this.getDuracion() * 3 * 1.21;
    }
}
```

```java
public class LlamadaInternacional extends Llamada {
    public LlamadaInternacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    public double calcularMonto() {
        // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
        return this.getDuracion() * 150 * 1.21 + 50;
    }
}
```

```java
public class Cliente {
    // Atributos...

    @Deprecated
    public Llamada registrarLlamada(Cliente destino, String tipo, int duracion) {
        switch (tipo) {
            case "nacional":
                return this.registrarLlamadaNacional(destino, duracion);
            case "internacional":
                return this.registrarLlamadaInternacional(destino, duracion);
            default:
                throw new IllegalArgumentException(tipo + " no es un tipo válido");
        }
    }

    private Llamada _registrarLlamada(Llamada llamada) {
        this.llamadas.add(llamada);
        return llamada;
    }

    public Llamada registrarLlamadaNacional(Cliente destino, int duracion) {
        return this._registrarLlamada(
                new LlamadaNacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion));
    }

    public Llamada registrarLlamadaInternacional(Cliente destino, int duracion) {
        return this._registrarLlamada(
                new LlamadaInternacional(this.getNumeroTelefono(), destino.getNumeroTelefono(), duracion));
    }

    // Otros métodos
}
```

---

## Refactoring 6

### Mal olor

Las implementaciones al método `calcularMonto()` de `Llamada` realizan la misma serie de pasos. Podemos pensar el
cálculo del monto como una receta formada por duración * precio por segundo (3 para las nacionales y 150 para las
internacionales) + IVA + costo adicional (0 para las llamadas nacionales y 50 para las internacionales). Además,
estos métodos están llenos de *números mágicos* que atentan contra la legibilidad del código.

### Extracto del código que presenta el mal olor

```java
public class LlamadaInternacional extends Llamada {
    // ...
    @Override
    public double calcularMonto() {
        // el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
        return this.getDuracion() * 150 * 1.21 + 50;
    }
}
```

```java
public class LlamadaNacional extends Llamada {
    // ...
    @Override
    public double calcularMonto() {
        // el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
        return this.getDuracion() * 3 * 1.21;
    }
}
```

### Refactoring a aplicar que resuelve el mal olor

Aplicaremos ***Form Template Method***, para ello haremos que el método `calcularMonto()` en la clase `Llamada` deje
de ser abstracta e implemente los pasos abstractos utilizando los métodos abstractos y protegidos `getCostoPorSegundo()`
y `getCostoAdicional()`, que deberán ser implementados por las subclases. Además, siguiendo ***Replace Magic
Literal***, definiremos una constante simbólica para reemplazar el número mágico del IVA.

### Código con el refactoring aplicado

```java
public abstract class Llamada {
    // Atributos...

    private static final double IVA = 0.21;

    public Llamada(String origen, String destino, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public double calcularMonto() {
        return this.getDuracion() * this.getCostoPorSegundo() * (1 + IVA) + this.getCostoAdicional();
    }

    protected abstract double getCostoPorSegundo();

    protected abstract double getCostoAdicional();

    // Getters y setters...
}
```

```java
public class LlamadaNacional extends Llamada {
    public LlamadaNacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    protected double getCostoPorSegundo() {
        return 3;
    }

    @Override
    protected double getCostoAdicional() {
        return 0;
    }
}
```

```java
public class LlamadaInternacional extends Llamada {
    public LlamadaInternacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }

    @Override
    protected double getCostoPorSegundo() {
        return 150;
    }

    @Override
    protected double getCostoAdicional() {
        return 50;
    }
}
```

---

## Refactoring 7

### Mal olor

La clase `Cliente` no posee un constructor. Esto es un problema porque no se define claramente que datos son
necesarios al momento de crear un cliente, lo que podría llevar a la creación de objetos con datos inválidos (por
ejemplo, un cliente sin nombre). Además, Java ya provee los constructores para la creación de objetos, por lo que no
estamos aprovechando las herramientas que nos brinda el lenguaje. Finalmene, un atributo debería ser establecido en la
creación y nunca alterarse. Al proveer un setter se indica que ese atributo podría cambiar y se rompe el
encapsulamiento.

### Extracto del código que presenta el mal olor

```java
public class Cliente {
    public List<Llamada> llamadas = new ArrayList<Llamada>();
    private String tipo;
    private String nombre;
    private String numeroTelefono;
    private String cuit;
    private String dni;

    // Otros métodos y getters...

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }
}
```

```java
public class Empresa {
    // ...
    public Cliente registrarUsuario(String data, String nombre, String tipo) {
        Cliente var = new Cliente();
        if (tipo.equals("fisica")) {
            var.setNombre(nombre);
            String tel = this.obtenerNumeroLibre();
            var.setTipo(tipo);
            var.setNumeroTelefono(tel);
            var.setDNI(data);
        } else if (tipo.equals("juridica")) {
            String tel = this.obtenerNumeroLibre();
            var.setNombre(nombre);
            var.setTipo(tipo);
            var.setNumeroTelefono(tel);
            var.setCuit(data);
        }
        clientes.add(var);
        return var;
    }
    // ...
}
```

### Refactoring a aplicar que resuelve el mal olor

Para resolver este mal olor aplicaremos la técnica ***Remove Setting Method***. Primero implementaremos un
constructor dentro de la clase `Cliente` para establecer todos los valores necesarios y moveremos la inicialización
de la lista `llamadas` al constructor. Luego, marcaremos todos los setters como *obsoletos*, ya que consideramos
que no son necesarios. No los borraremos para no alterar la interfaz de la clase. Finalmente, en la clase `Empresa`,
dentro del método `registrarUsuario()`, usaremos el constructor previamente mencionado asignándole `null` a los
atributos que no utiliza.

También aplicaremos ***Consolidate Duplicate Conditional Fragments*** para eliminar el código repetido en el if-else.
Moveremos la variable `tel` antes del if-else.

### Código con el refactoring aplicado

```java
public class Cliente {
    public List<Llamada> llamadas;
    private String tipo;
    private String nombre;
    private String numeroTelefono;
    private String cuit;
    private String dni;

    static double descuentoJur = 0.15;
    static double descuentoFis = 0;

    public Cliente(String tipo, String nombre, String numeroTelefono, String cuit, String dni) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.cuit = cuit;
        this.dni = dni;
        this.llamadas = new ArrayList<>();
    }

    // Otros métodos y getters...

    @Deprecated
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Deprecated
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Deprecated
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Deprecated
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Deprecated
    public void setDNI(String dni) {
        this.dni = dni;
    }
}
```

```java
public class Empresa {
    // ...
    public Cliente registrarUsuario(String data, String nombre, String tipo) {
        Cliente var = null;
        String tel = this.obtenerNumeroLibre();
        if (tipo.equals("fisica")) {
            var = new Cliente(nombre, tipo, tel, null, data);
        } else if (tipo.equals("juridica")) {
            var = new Cliente(nombre, tipo, tel, data, null);
        }
        clientes.add(var);
        return var;
    }
    // ...
}
```

---

## Refactoring 8

### Mal olor

En el método `aplicarDescuento()` de la clase `Cliente` utilizamos un `if` para determinar el descuento a aplicar
según el tipo de cliente. Esto es un problema porque no se aprovecha el polimorfismo.

### Extracto del código que presenta el mal olor

```java
public class Cliente {
    // ...
    private double aplicarDescuento(double monto) {
        if (this.getTipo() == "fisica") {
            return monto * (1 - descuentoFis);
        } else if (this.getTipo() == "juridica") {
            return monto * (1 - descuentoJur);
        }
        return monto;
    }
    // ...
}
```

### Refactoring a aplicar que resuelve el mal olor

Para resolver este mal olor aplicaremos ***Replace Conditional with Polymorphism***, siguiendo una metodología muy
similar a la utilizada en el refactoring 5. Primero haremos que la clase `Cliente` sea abstracta y que de ella
extiendan dos nuevas clases (una para cada tipo) `ClienteFisico` y `ClienteJuridico`. Luego, haremos que el método
`aplicarDescuento()` sea abstracto y que cada una de las subclases lo implemente de acuerdo a sus necesidades.

Al igual que ocurrió en el refactoring 5, al realizar estos cambios ya no podremos instanciar a `Cliente`, por lo
que tendremos que modificar al método `registrarUsuario()` de la clase `Empresa`. Crearemos tres métodos nuevos:

- `_registrarUsuario()`: para manejar la lógica de registrar un ususario.
- `registrarUsuarioFisico()`: para crear un usuario físico y después pasárselo a `_registrarUsuario()`.
- `registrarUsuarioJuridico()`: para crear un usuario jurídico y después pasárselo a `_registrarUsuario()`.

Finalmente, modificaremos al método `registrarUsuario()` de la clase `Empresa` para que se encargue de llamar al
método `registrarUsuarioFisico()` o `registrarUsuarioJuridico()` según corresponda y marcaremos a este método como
*obsoleto*, ya que es preferible utilizar alguno de los métodos nuevos, pero no lo borramos porque no queremos
modificar la interfaz de la clase `Empresa`.

### Código con el refactoring aplicado

```java
public abstract class Cliente {
    // ...
    protected abstract double aplicarDescuento(double monto);
    // ...
}
```

```java
public class ClienteJuridico extends Cliente {
    public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
        super("juridica", nombre, numeroTelefono, cuit, null);
    }

    @Override
    protected double aplicarDescuento(double monto) {
        return monto * (1 - Cliente.descuentoJur);
    }
}
```

```java
public class ClienteFisico extends Cliente {
    public ClienteFisico(String nombre, String numeroTelefono, String dni) {
        super("fisica", nombre, numeroTelefono, null, dni);
    }

    @Override
    protected double aplicarDescuento(double monto) {
        return monto * (1 - Cliente.descuentoFis);
    }
}
```

```java
public class Empresa {
    // ...
    @Deprecated
    public Cliente registrarUsuario(String data, String nombre, String tipo) {
        switch (tipo) {
            case "fisica":
                return this.registrarClienteFisico(nombre, data);
            case "juridica":
                return this.registrarClienteJuridico(nombre, data);
            default:
                throw new IllegalArgumentException(tipo + " no es un tipo válido");
        }
    }

    private Cliente _registrarUsuario(Cliente cliente) {
        this.clientes.add(cliente);
        return cliente;
    }

    public Cliente registrarClienteFisico(String nombre, String dni) {
        return this._registrarUsuario(new ClienteFisico(nombre, this.obtenerNumeroLibre(), dni));
    }

    public Cliente registrarClienteJuridico(String nombre, String cuit) {
        return this._registrarUsuario(new ClienteJuridico(nombre, this.obtenerNumeroLibre(), cuit));
    }
    // ...
}
```

## Refactoring X

### Mal olor

Explicación

### Extracto del código que presenta el mal olor

```java

```

### Refactoring a aplicar que resuelve el mal olor

Explicación

### Código con el refactoring aplicado

```java

```
