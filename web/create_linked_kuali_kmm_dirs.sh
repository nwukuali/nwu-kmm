#!/bin/bash

if [ -z "$KUALI_KMM_HOME" ] ; then
  KUALI_KMM_HOME='../../../../kuali-kmm'
fi


pushd src/main
	[ ! -d java ] && ln -s $KUALI_KMM_HOME'/src/java' java
	[ ! -d webapp ] && ln -s $KUALI_KMM_HOME'/src/web' webapp
	[ ! -d resources ] && ln -s $KUALI_KMM_HOME'/src/conf/project' resources
popd

