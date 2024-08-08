const express = require('express');
const history = require('connect-history-api-fallback')

const app = express();

app.get('/api/parts',(req, res) => res.send({
    heads: [
        {
            id: 1,
            description: 'My head description...',
            title: 'My head title....',
            src: '/api/images/head.png'
        }
    ],
    bases: [
        {
            id: 2,
            description: 'My base description...',
            title: 'My base title....',
            src: '/api/images/base.png'
        }
    ],
    arms: [
        {
            id: 3,
            description: 'My arm description...',
            title: 'My arm title....',
            src: '/api/images/arm.png'
        }
    ]
}));

app.use(history({index: '/indexAntigo.html'}));

app.use('/api/images', express.static('images'));

app.use('/', express.static('dist', {index: 'indexAntigo.html'}));

app.listen(8081, ()=> console.log('my api NodeJS express running on 8081'));