National Parks and Historic Locations
=========

Leaflet mapping front end with a JaxRS and MongoDB back end.

The front page with the leaflet example is in [src/main/webapp/index.html](https://github.com/ryanj/javaparks/blob/master/src/main/webapp/index.html)

Take a look at this file to see the web services and MongoDB queries: [/src/main/java/org/openshift/webservice/ParkWS.java](https://github.com/ryanj/javaparks/blob/master/src/main/java/org/openshift/webservice/ParkWS.java)

A live demo is available here: [http://javaparks-rjdemo.rhcloud.com/](http://javaparks-rjdemo.rhcloud.com/)

## Instant Provisioning on OpenShift
To deploy a clone of this application using the [`rhc` command line tool](http://rubygems.org/gems/rhc), type:

    rhc app create parks jbossas-7 mongodb-2.4 --from-code=https://github.com/ryanj/javaparks.git
    
Or, [link to a web-based **clone+deploy**](https://openshift.redhat.com/app/console/application_type/custom?name=parks&cartridges%5B%5D=jbossas&cartridges%5B%5D=mongodb-2&initial_git_url=https%3A%2F%2Fgithub.com%2Fryanj%2Fjavaparks.git) on [OpenShift Online](http://OpenShift.com) or [your own open cloud](http://openshift.github.io): 

    https://openshift.redhat.com/app/console/application_type/custom?name=parks&cartridges%5B%5D=jbossas&cartridges%5B%5D=mongodb-2&initial_git_url=https%3A%2F%2Fgithub.com%2Fryanj%2Fjavaparks.git

## Setting up Git-based collaboration with OpenShift
The above `rhc app create` command provides an easy way to complete each of the following tasks in a single step: 

1. Check out a local clone of this project source:
    
        git clone https://github.com/ryanj/javaparks
    
2. Create a new OpenShift app with JBoss7 and MongoDB (add `--no-git`, since we already have our source):
    
        rhc app create parks jbossas-7 mongodb-2.4 --no-git
    
    **Note:** *This step can also be completed using the OpenShift web interface.*
    
3. Add the resulting git repo url to your local project:
    
        git remote add parks ssh://YOUR_APPS_GIT_REMOTE_URL
    
4. Push your application source to OpenShift (include `-f` on the first push):

        git push -f parks master

### Deploying WAR and EAR files
Information how to [deploy pre-compiled java apps](https://www.openshift.com/kb/kb-e1088-how-to-deploy-pre-compiled-java-applications-war-and-ear-files-onto-your-openshift-gear) is available online: 
[https://www.openshift.com/kb/kb-e1088-how-to-deploy-pre-compiled-java-applications-war-and-ear-files-onto-your-openshift-gear](https://www.openshift.com/kb/kb-e1088-how-to-deploy-pre-compiled-java-applications-war-and-ear-files-onto-your-openshift-gear)
