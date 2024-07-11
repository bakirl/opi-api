build: google links gen/__init__.py
	python -m grpc_tools.protoc \
		-Iprotos -Iopinetcommon -I. \
		--python_out=gen --pyi_out=gen --grpc_python_out=gen \
		protos/*.proto \
		opinetcommon/*.proto \
		google/api/*.proto

google:
	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api

gen/__init__.py:
	mkdir gen
	touch gen/__init__.py

links: protos opinetcommon

protos:
	ln -s ../../../../network/cloud protos

opinetcommon:
	ln -s ../../../../network/opinetcommon opinetcommon

clean:
	rm -rf google gen protos opinetcommon

run_server: build
	PYTHONPATH=./gen python cloudrpc_server.py

run_client: build
	PYTHONPATH=./gen no_proxy=localhost python cloudrpc_client.py
