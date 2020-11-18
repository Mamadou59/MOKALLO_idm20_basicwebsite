# MOKALLO_idm20_basicwebsite

## Binômes:

- *DIALLO Mamadou*
- *FUNGWA MOKE Junior*

## Contenu

Ce depôt contient six projet qui sont:

- org.eclipse.sirius.sample.basicwebsite

		Ce premier projet contient le metamodel à partir du quel nous representons un site web basic.
		
- org.eclipse.sirius.sample.basicwebsite.edit / *.editor

		Ces deux projets contienent les classes supports representant le metamodel.
				
- org.eclipse.sirius.sample.basicwebsite.model1

		Celui-ci contient un model de notre site web

			org.eclipse.sirius.sample.basicwebsite.model1/
			├── MyBasicWebsiteModel.basicwebsite
			└── representations.aird

- org.eclipse.acceleo.idm20.generator
		
		Dans celui-ci se trouve le projet de la géneration de code avec Acceleo.
		
- Website

		Website/
		├── images
		│   └── mokallo.png
		└── src-gen
		    ├── index.html
		    ├── page1.html
		    ├── page2.html
		    └── page.css
		    
- idm.transfos

		Dans ce repertoire se trouve la partie sur la transformation d'un model vers un autre.
		
		
		idm.transfos/
		├── pje20.ville (le metamodel de ville)
		├── idm.annuaire (le metamodel annuaire)
		├── idm.transfo.ville2person (les transfos de ville vers annuaire)
		│   └── transform
		│   	├── habitant2person.qvto 
		│   	├── ville2lib.qvto
		│   	└── construction2building.qvto
		├── idm.annuaire (le metamodel annuaire)
		└── test (qui contient un model de ville)
