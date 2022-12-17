	FROM node:alpine3.14 as node
	RUN mkdir -p /app

	WORKDIR /app

	COPY package.json /app/
	RUN npm install

	COPY . /app/
	RUN npm install -g @angular/cli

	RUN npm run build --prod

	FROM nginx:alpine
	COPY --from=node /app/dist/trip /usr/share/nginx/html
	COPY ./nginx/nginx.conf /etc/nginx/conf.d/default.conf

	CMD ["/bin/sh",  "-c",  "envsubst < /usr/share/nginx/html/assets/env.template.js > /usr/share/nginx/html/assets/env.js && exec nginx -g 'daemon off;'"]
