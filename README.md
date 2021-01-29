# Sujet

**Bataille navale** :ship: :speedboat: :sailboat:

https://slides.com/gpuget/extreme-programming/

## User stories

### Première version : Description

| Id | En tant que ... | Je veux ... | Pour ... | Valeur métier |
|---|---|---|---|---|
|1|Joueur|Connaître ses bateaux|Les placer sur le plateau de jeu|xxx|  |
|2|Joueur|Voir le plateau de jeu|Placer ses bateaux|xxx|
|3|Joueur|Choisir le prochain coup|Toucher un bateau adverse|xxx|
|4|Joueur|Voir où a tiré l'adversaire|Savoir s'il touche un de mes bateaux|xxx|
|5|Spectateur|Voir les deux maps|Suivre le cours de la partie|xxx|
|6|Joueur|Placer un bateau|Initialiser la partie|xxx|
|7|Joueur|Pouvoir sélectionner le nombre de joueurs |Choisir mon mode de jeu (vs IA ou Joueur)|xxx|
|8|Joueur|Ne pas voir le placement des bateaux de l'adversaire|Préserver le game-play|xxx|
|9|Joueur|Savoir si toutes les parties d'un bateau ont été touchées|Savoir si le bateau a été coulé|xxx|
|10|Joueur|Déterminer si tous les bateaux de l'adversaire sont coulés|savoir si j'ai gagné|xxx|
|11|Joueur|Savoir si j'ai touché un bateau|Guider mes prochains coups|xxx|
|12|Joueur|Rejoindre la partie|Jouer contre un adversaire|xxx|
|13|Joueur|Distinction tir touché ou manqué sur la map|Choisir mon prochain tir|xxx|
|14|Joueur|Voir le nombre de parties que j'ai gagnées ou perdues|Suivre mon score|xxx|
|15|Joueur|Commencer une nouvelle série de partie|Remettre les scores à zéro|xxx|
|16|Joueur|Quitter une partie en cours|**Ragequit** et arrêter de jouer|xxx|
|17|Spectateur|Rejoindre une partie en cours|Suivre le match|xxx|
|18| Adversaire | jouer après joueur (ou l'IA) | alterner les joueurs | xxx |
|19| Joueur | gagner un point lorsque je touche un bateau ennemi | gagner la partie | xxx |
|20| Joueur | Voir là où j'ai tiré | Choisir mon prochain tir | xxx |

### Deuxième version : INVEST

| Id | En tant que ... | Je veux ... | Pour ... | INVEST check |
|---|---|---|---|---|
|12|Joueur|Rejoindre une partie active|Jouer contre un adversaire|INVE-T|
|25| joueur | ne pas pouvoir rejoindre une partie déjà active | ne pas déranger la partie | INVEST | 
|13|Joueur|attendre l'adversaire en mode "multijoueur" | pour commencer la partie|-NVEST|
|17|Spectateur|Rejoindre une partie en cours|Suivre le match|INVE-T|
|7|Joueur|Sélectionner le mode "Contre IA" |jouer contre une IA|INVEST|
|71|Joueur|Sélectionner le mode "Multijoueur" |jouer avec d'autres humains|INVEST|
|21|Joueur|Pouvoir sélectionner la taille de la grille|Choisir la taille|IN-EST|
|---|---|---|---|---|---|
|1|Joueur|Connaître ses bateaux|Les placer sur le plateau de jeu|INVEST|  |
|6|Joueur|Placer un bateau|Initialiser la partie|INVEST|
|2|Joueur|Voir le plateau de jeu|Placer ses bateaux|INVEST|
|---|---|---|---|---|---|
|18| Adversaire | jouer après l'adversaire | alterner les joueurs | --VEST |
|(23)| joueur | attendre que l'adversaire joue | continuer la partie partie | -NV--T |
|3|joueur|Choisir le prochain coup|essayer de toucher l'adversaire|I-VEST|
|20| Joueur | Voir là où j'ai tiré | Choisir mon prochain tir | I-VEST |
|4|Joueur|Voir où a tiré l'adversaire|Savoir s'il touche un de mes bateaux|INV-ST|
|9|Joueur|Savoir si toutes les parties d'un bateau ont été touchées|Savoir si le bateau a été coulé|I-VEST|
|11|Joueur|Savoir si j'ai touché un bateau|Guider mes prochains coups|--VEST|
|19| Joueur | gagner un point lorsque je touche un bateau ennemi | gagner la partie | -NVEST |
|---|---|---|---|---|---|
|5|Spectateur|Voir les deux maps|Suivre le cours de la partie|I-VEST|
|8|Joueur|Ne pas voir le placement des bateaux de l'adversaire|Préserver le game-play|I-VEST|
|10|Joueur|Déterminer si tous les bateaux de l'adversaire sont coulés|savoir si j'ai gagné|--VEST|
|22|Joueur|Différencier si les tirs ont touché ou manqué un bateau adversaire, sur ma map|planifier mes prochains tours|-NVEST|
|Meta-parties|---|---|---|---|---|
|15|Joueur|Commencer une nouvelle série de partie|Remettre les scores à zéro|INVEST|
|14|Joueur|Voir le nombre de parties que j'ai gagnées ou perdues|Suivre mon score|INVEST|
|16|Joueur|quitter une partie en cours|**Ragequit** arrêter de jouer|INVEST|

### Troisième version : valeur métier et conditions d'acceptation

#### Valeur métier

| Id | En tant que ... | Je veux ... | Pour ... | Valeur métier /100 |
|---|---|---|---|---|
<<<<<<< HEAD
|12|Joueur|Rejoindre une partie active|Jouer contre un adversaire||
|25| joueur | ne pas pouvoir rejoindre une partie déjà active | ne pas déranger la partie || 
|13|Joueur|attendre le bon nombre d'adversaire (0 ou 1)| pour commencer la partie||
=======
|7|Joueur|Sélectionner le mode "Contre IA" |jouer contre une IA| 30 |
|12|Joueur|Rejoindre une partie active|Jouer contre un adversaire|20 UTILE ?|
|13|Joueur|attendre l'adversaire en mode "multijoueur" | pour commencer la partie|20 UTILE ?|
>>>>>>> e1b82890fb99121b4dc2e828384347624fcf82d8
|17|Spectateur|Rejoindre une partie en cours|Suivre le match||
|21|Joueur|Pouvoir sélectionner la taille de la grille|Choisir la taille|IN-EST|
|25| joueur | ne pas pouvoir rejoindre une partie déjà active | ne pas déranger la partie | INVEST | 
|71|Joueur|Sélectionner le mode "Multijoueur" |jouer avec d'autres humains|INVEST|
|---|---|---|---|---|---|
|1|Joueur|Connaître ses bateaux|Les placer sur le plateau de jeu|INVEST|  |
|2|Joueur|Voir le plateau de jeu|Placer ses bateaux|INVEST|
|6|Joueur|Placer un bateau|Initialiser la partie|INVEST|
|---|---|---|---|---|---|
<<<<<<< HEAD
|18| Adversaire | jouer après joueur (ou l'IA) | alterner les joueurs ||
|3|joueur|Choisir le prochain coup|toucher l'adversaire||
|(23)| joueur | attendre que l'IA joue | continuer une partie sans adversaire |  |
|20| Joueur | Voir là où j'ai tiré | Choisir mon prochain tir |  |
|4|Joueur|Voir où a tiré l'adversaire|Savoir s'il touche un de mes bateaux||
|9|Joueur|Savoir si toutes les parties d'un bateau ont été touchées|Savoir si le bateau a été coulé||
|11|Joueur|Savoir si j'ai touché un bateau|Guider mes prochains coups||
|19| Joueur | gagner un point lorsque je touche un bateau ennemi | gagner la partie |  |
=======
|3|joueur|Choisir le prochain coup|essayer de toucher l'adversaire|I-VEST|
|4|Joueur|Voir où a tiré l'adversaire|Savoir s'il touche un de mes bateaux|INV-ST|
|9|Joueur|Savoir si toutes les parties d'un bateau ont été touchées|Savoir si le bateau a été coulé|I-VEST|
|11|Joueur|Savoir si j'ai touché un bateau|Guider mes prochains coups|--VEST|
|18| Adversaire | jouer après l'adversaire | alterner les joueurs | --VEST |
|19| Joueur | gagner un point lorsque je touche un bateau ennemi | gagner la partie | -NVEST |
|20| Joueur | Voir là où j'ai tiré | Choisir mon prochain tir | I-VEST |
|(23)| joueur | attendre que l'adversaire joue | continuer la partie partie | -NV--T |
>>>>>>> e1b82890fb99121b4dc2e828384347624fcf82d8
|---|---|---|---|---|---|
|5|Spectateur|Voir les deux maps|Suivre le cours de la partie|I-VEST|
|8|Joueur|Ne pas voir le placement des bateaux de l'adversaire|Préserver le game-play|I-VEST|
|10|Joueur|Déterminer si tous les bateaux de l'adversaire sont coulés|savoir si j'ai gagné|--VEST|
|Meta-parties|---|---|---|---|---|
<<<<<<< HEAD
|15|Joueur|Commencer une nouvelle série de partie|Remettre les scores à zéro||
|14|Joueur|Voir le nombre de parties que j'ai gagnées ou perdues|Suivre mon score||
|16|Joueur|quitter une partie en cours|**Ragequit** arrêter de jouer||

=======
|14|Joueur|Voir le nombre de parties que j'ai gagnées ou perdues|Suivre mon score|INVEST|
|15|Joueur|Commencer une nouvelle série de partie|Remettre les scores à zéro|INVEST|
|16|Joueur|quitter une partie en cours|**Ragequit** arrêter de jouer|INVEST|
|22|Joueur|Différencier si les tirs ont touché ou manqué un bateau adversaire, sur ma map|planifier mes prochains tours|-NVEST|
A la semaine prochaine
:3
>>>>>>> e1b82890fb99121b4dc2e828384347624fcf82d8
#### Conditions d'acceptation

|Ref| Etant donné... | Quand... | Alors... |
|---|---|---|---|
|1|Le début de partie, plateau vierge|Le jeu commence, avant le plaçage des pièces| le joueur voit toutes les pièces qu'il pourra placer|
|2|Le début de partie, plateau vierge|le jeu commence, avant la phase d'attaque| le joueur peut placer toutes les pièces à sa disposition, sans superposition|
|3|Un plateau de jeu à un instant donné | le joueur renseigne les coordonnées de son coup | Le coup est lancé sur le plateau adverse |
|4| Un tir ennemi | l'adversaire tire | le joueur recoit un message |
|4|Un tir ennemi | l'adversaire tire | le tir s'affiche sur le plateau allié|
|4|Un tir ennemi | l'adversaire tire | on vérifie si le tir a touché un bateau |
|5|La partie est en cours|un joueur joue à son tour|le spectateur voit la nouvelle grille actualisée|
|6| la grille est de taille 10| le joueur place un bateau en 11-B-S |le placement est refusé|
|6| la grille est de taille 10| le joueur place en bateau de taille 3 en 3-9-E|le placement est refusé|
|6| la grille est de taille 10| le joueur place en bateau de taille 3 en 3-9-W|le placement est effectué|
|7|Quand on sélectionne le nombre de joueurs | >2 joueurs ou <0 joueur | Partie ne peut pas être lancé|
|8|Une partie à deux joueurs|le joueur 1 joue| il ne voit pas le plateau de jeu du joueur 2|
|9|Un bateau sur le terrain|toutes ses parties ont été touchées|le bateau est signalé comme coulé|
|10|Une carte de jeu pendant une partie,pendant le tour du joueur| le tir du joueur viens de couler le dernier bateau de l'adversaire | annoncer la victoire du joueur|
|11| Un tir allié| le joueur tire | le tir s'affiche sur le plateau ennemi |
|11| Un tir allié| le joueur tire | le joueur recoit un message selon le résultat du tir |
|12|aucune partie n'est commencée|un joueur démarre une partie|un adversaire est créé|

|18|Le flot d'action courant | un joueur termine son tour | son adversaire débute son tour |
|19| Un tir allié | Le joueur a touché | le joueur marque des points|
|20|Une partie en cours|Je souhaite tirer|le joueur a accès aux tirs précédents|
|21|La partie n'a pas commencé|le joueur sélectionne la taille de la grille| une grille de la bonne tailler s'affiche|
|22|Un coup annoncé|Il touche un bateau|le joueur est prévenu qu'il a touché un bateau|
|(23)| *est-ce qu'attendre ca fait partir des fonctions de jeu?* Le flot d'action courant |le joueur termine son tour contre l'IA| Le joueur patiente pendant le tour de l'IA |


|71|Le menu principal| le joueur sélectionne le mode "2 joueurs"| la partie à deux joueurs débute|